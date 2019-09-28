package acmicpc_1912;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numberArray = new int[N+1];
        int[] DP = new int[N+1];

        for(int i = 1; i <= N ; i++){
            numberArray[i] = scanner.nextInt();
        }

        int maxValue = Integer.MIN_VALUE;

        for(int i = 1; i <= N; i++){
            DP[i] = Math.max(DP[i-1]+numberArray[i], numberArray[i]);
            if(maxValue < DP[i]){
                maxValue = DP[i];
            }
        }

        System.out.println(maxValue);
    }
}
