package acmicpc_2167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array = new int[N][M];

        for(int i = 0; i < N ; i++){
            for(int j = 0 ;  j < M; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int K = scanner.nextInt();

        for(int i = 0 ;i < K ; i++){
            int p = scanner.nextInt()-1;
            int k = scanner.nextInt()-1;
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;

            int answer = 0;

            for(int j = p ; j <= x; j++){
                for(int a = k ; a <= y; a++){
                    answer += array[j][a];
                }
            }
            System.out.println(answer);
        }
    }
}
