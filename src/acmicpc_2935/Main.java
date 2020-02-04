package acmicpc_2935;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String operator = scanner.next();
        String B = scanner.next();
        int Alength = A.length()-1;
        int Blength = B.length()-1;

        if(operator.equals("+")){
            if(Alength > Blength){
                String answer = A.substring(0, Alength-Blength) + B;
                System.out.println(answer);
            }else if(Alength < Blength){
                String answer = B.substring(0, Blength-Alength) + A;
                System.out.println(answer);
            }else{
                String answer = "2";
                for(int i = 0 ; i < Alength; i++){
                    answer += "0";
                }
                System.out.println(answer);
            }
        }else if(operator.equals("*")){
            String answer = "1";

            for(int i = 0 ; i < (Alength+Blength); i++){
                answer+="0";
            }

            System.out.println(answer);
        }
    }
}
