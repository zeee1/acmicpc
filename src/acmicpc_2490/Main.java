package acmicpc_2490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < 3; i++){
            int zeroCount = 0;
            int oneCount = 0;

            for (int j = 0 ; j < 4; j++){
                int inputNumber = scanner.nextInt();

                if(inputNumber == 1){
                    oneCount += 1;
                }else{
                    zeroCount += 1;
                }
            }

            if(zeroCount == 2 && oneCount == 2){
                System.out.println("B");
            }
            else if(zeroCount == 1 && oneCount == 3){
                System.out.println("A");
            }
            else if(zeroCount == 3 && oneCount == 1){
                System.out.println("C");
            }
            else if(zeroCount == 4 && oneCount == 0){
                System.out.println("D");
            }
            else{
                System.out.println("E");
            }
        }
    }
}
