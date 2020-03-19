package acmicpc_9461;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        long[] DP = new long[101];
        DP[0] = 0;
        DP[1] = 1;
        for(int i = 2 ; i <= 100 ; i++){
            if(i == 2){
                DP[2] = 1;
                continue;
            }

            if(i <= 5){
                DP[i] = DP[i-2]+DP[i-3];
            }
            else{
                DP[i] = DP[i-1]+DP[i-5];
            }

        }

        for(int i= 0 ; i < testcaseNumber; i++){
            int number = scanner.nextInt();

            System.out.println(DP[number]);
        }
    }
}
