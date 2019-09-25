package acmicpc_1932;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] triangle = new int[N][N];
        int[][] sum = new int[N][N];
        int max_value = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j <= i ; j++){
                triangle[i][j] = scanner.nextInt();

                if(i == 0){
                    sum[i][j] = triangle[i][j];
                    max_value = sum[i][j];
                    continue;
                }

                if(j == 0){
                    sum[i][j] = sum[i-1][j]+triangle[i][j];
                }
                else if(j == i){
                    sum[i][j] = triangle[i][j]+sum[i-1][j-1];
                }
                else{
                    sum[i][j] = triangle[i][j]+Math.max(sum[i-1][j-1], sum[i-1][j]);
                }

                if(sum[i][j] > max_value)
                    max_value = sum[i][j];
            }
        }

        System.out.println(max_value);

    }
}
