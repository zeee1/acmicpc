package acmicpc_2193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] DP = new long[91];

        DP[1] = 1;
        DP[2] = 1;

        for(int i = 3; i<= N ; i++){
            DP[i] = DP[i-1]*2-DP[i-3];
        }

        System.out.println(DP[N]);
    }
}
