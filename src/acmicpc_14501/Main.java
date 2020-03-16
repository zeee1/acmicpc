package acmicpc_14501;

import java.util.Scanner;

public class Main {
    public static int N;
    public static int[] T;
    public static int[] P;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        T = new int[N+1];
        P = new int[N+1];

        for(int i = 1; i <= N ; i++){
            T[i] = scanner.nextInt();
            P[i] = scanner.nextInt();
        }

        int[] payDP = new int[N+1];

        if(T[1] > 1){
            payDP[1] = 0;
        }else{
            payDP[1] = P[1];
        }

        for(int i = 1; i <= N ; i++){
            int endDay = i+T[i]-1;
            payDP[i] = Math.max(payDP[i-1], payDP[i]);

            if(endDay > N){
                continue;
            }

            payDP[endDay] = Math.max(payDP[i-1]+P[i], payDP[endDay]);
        }


        System.out.println(payDP[N]);
    }
}
