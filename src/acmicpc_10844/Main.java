package acmicpc_10844;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] array= new int[N+1][10];

        for(int i= 1; i < 10 ; i++){
            array[1][i] = 1;
        }

        for(int i = 2; i <= N ; i++){
            for(int j  = 0 ; j <= 9 ; j++){
                if(j == 0){
                    array[i][j] = array[i-1][j+1];
                }
                else if(j == 9){
                    array[i][j] = array[i-1][j-1];
                }

                else{
                    array[i][j] = (array[i-1][j+1]+array[i-1][j-1])%1000000000;
                }

            }
        }

        long sum = 0;

        for(int i = 0 ; i < 10 ; i++){
            sum += array[N][i];
        }

        System.out.println(sum%1000000000);
    }
}
