package acmicpc_11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] coins = new int[N];

        for(int i = 0; i < N ; i++){
            coins[i] = scanner.nextInt();
        }
        int coinCount = 0;

        while(K > 0){
            int prev = 0;
            int prev_coin= 0;

            for(int i = 0 ; i < N ; i++){
                if(K/coins[i] == 0){
                    break;
                }
                prev = K/coins[i];
                prev_coin = coins[i];
            }
            coinCount+= prev;
            K -= (prev_coin*prev);
        }

        System.out.println(coinCount);
    }
}
