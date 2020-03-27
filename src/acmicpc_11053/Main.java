package acmicpc_11053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for(int i = 0 ; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int[] DP = new int[N];
        DP[0] = 1;

        int maxAnswer = 1;
        for(int i = 1 ; i < N ; i++){
            DP[i] = 1;
            for(int j = 0; j < i ; j++){
                if(array[j] < array[i])
                    DP[i] = Math.max(DP[i], DP[j]+1);
            }

            maxAnswer = Math.max(maxAnswer, DP[i]);
        }

        System.out.println(maxAnswer);
    }
}
