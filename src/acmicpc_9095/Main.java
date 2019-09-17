package acmicpc_9095;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();
        int[] DP = new int[11];

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;

        for(int j = 4; j < 11; j++){
            DP[j] = DP[j-2]+DP[j-1]+DP[j-3];
        }

        for(int i = 0 ;  i < testcaseNumber; i++)
        {
            int testcase = scanner.nextInt();
            System.out.println(DP[testcase]);
        }
    }
}
