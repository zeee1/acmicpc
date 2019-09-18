package acmicpc_1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] costRecord = new int[N][3];

        for(int i = 0 ; i < N; i++){
            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();

            if(i == 0){
                costRecord[0][0] = r;
                costRecord[0][1] = g;
                costRecord[0][2] = b;
            }
            else{
                costRecord[i][0] = Math.min(costRecord[i-1][1], costRecord[i-1][2])+r;
                costRecord[i][1] = Math.min(costRecord[i-1][0], costRecord[i-1][2])+g;
                costRecord[i][2] = Math.min(costRecord[i-1][0], costRecord[i-1][1])+b;
            }
        }

        System.out.println(Math.min(Math.min(costRecord[N-1][0],costRecord[N-1][1]), costRecord[N-1][2]));
    }
}
