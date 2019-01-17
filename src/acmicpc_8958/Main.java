package acmicpc_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNum = scanner.nextInt();

        for(int i = 0 ; i < testcaseNum; i++){
            String oxValue = scanner.next();

            String prev_value = "";
            int prev_score = 0;
            int total_score = 0;

            for(int j = 0 ; j < oxValue.length(); j++){
                String crnt_value = oxValue.substring(j, j+1);

                if(crnt_value.equals("O")){
                    if(prev_value.equals(crnt_value)){
                        total_score += (prev_score+1);
                        prev_score += 1;
                    }
                    else{
                        total_score += 1;
                        prev_score = 1;
                    }
                }
                else{
                    prev_score = 0;
                }
                prev_value = crnt_value;
            }

            System.out.println(total_score);
        }
    }
}
