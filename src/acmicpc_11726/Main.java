package acmicpc_11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] DP = new int[1001];
        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;

        for(int i = 3; i < 1001; i++){
            DP[i] = (DP[i-1]+DP[i-2])%10007;
        }

        System.out.println(DP[N]);
    }
}
