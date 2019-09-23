package acmicpc_2579;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] stairs = new int[N+1];
        int[] DP = new int[N+1];

        for(int i = 1; i <= N; i++){
            stairs[i] = scanner.nextInt();
        }

        DP[1] = stairs[1];
        DP[2] = stairs[1]+stairs[2];
        DP[3] = Math.max(stairs[1]+stairs[3], stairs[2]+stairs[3]);

        for(int i = 4; i <= N; i++){
            DP[i] = Math.max(stairs[i]+DP[i-2], stairs[i-1]+stairs[i]+DP[i-3]);
        }

        System.out.println(DP[N]);

    }
}
