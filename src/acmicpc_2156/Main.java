package acmicpc_2156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] DP = new int[N+1];
        int[] wineglass = new int[N+1];

        for(int i = 1 ; i <= N; i++){
            wineglass[i] = scanner.nextInt();
        }

        DP[1] = wineglass[1];

        for(int i = 2; i <= N; i++){
            if(i == 2){
                DP[2] = DP[1]+wineglass[2];
            }
            else if(i == 3){
                int maxValue = Math.max(DP[2], wineglass[1]+wineglass[3]);
                maxValue = Math.max(maxValue, wineglass[2]+wineglass[3]);
                DP[3] = maxValue;
            }
            else{
                DP[i] = Math.max(DP[i-2]+wineglass[i], DP[i-3]+wineglass[i-1]+wineglass[i]);
                DP[i] = Math.max(DP[i], DP[i-1]);
            }
        }

        System.out.println(DP[N]);

    }
}
