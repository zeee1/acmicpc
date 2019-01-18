package acmicpc_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNum = scanner.nextInt();

        for(int i = 0 ; i < testcaseNum; i++){
            String oxValue = scanner.next();

            int continuous_count = 0;
            int total_score = 0;

            for(int j = 0 ; j < oxValue.length(); j++){
                String crnt_value = oxValue.substring(j, j+1);

                if(crnt_value.equals("O")){
                    continuous_count += 1;
                    total_score += continuous_count;
                }else{
                    continuous_count = 0;
                }

            }

            System.out.println(total_score);
        }
    }
}
