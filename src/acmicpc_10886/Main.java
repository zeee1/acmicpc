package acmicpc_10886;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int oneCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < N; i++){
            int input = scanner.nextInt();

            if(input == 1){
                oneCount+=1;
            }
            else{
                zeroCount+=1;
            }
        }

        if(oneCount > zeroCount){
            System.out.println("Junhee is cute!");
        }
        else{
            System.out.println("Junhee is not cute!");
        }
    }
}
