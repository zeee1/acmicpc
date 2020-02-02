package acmicpc_1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int answer = 0;
        for(int i= 0 ; i < 8; i++){
            String input = scanner.next();

            if(i%2 == 0){
                check = true;
            }
            else{
                check = false;
            }

            for(int j = 0 ; j < 8 ; j++){
                String jthChar = input.substring(j, j+1);
                if(jthChar.equals("F") && check == true){
                    answer += 1;
                }

                if(check == false){
                    check = true;
                }else{
                    check = false;
                }
            }
        }

        System.out.println(answer);
    }
}
