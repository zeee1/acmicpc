package acmicpc_2579;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N+1];
        int[] DP = new int[N+1];

        for(int i = 1; i <= N ;i++){
            arr[i] = scanner.nextInt();
        }

        DP[0] = 0;
        DP[1] = arr[1];

        if(N >= 2){
            DP[2] = arr[1]+arr[2];
            for(int i = 3; i <= N ; i++){
                DP[i] = Math.max(DP[i-3]+arr[i-1], DP[i-2])+arr[i];
            }
        }

        System.out.println(DP[N]);
    }
}
