package acmicpc_2468;

import java.util.Scanner;

public class Main {
    public static int[][] map;
    public static int N;
    public static boolean[][] check;
    public static int maxInput;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        map = new int[N][N];
        check = new boolean[N][N];
        maxInput = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                int input = scanner.nextInt();

                map[i][j] = input;

                if(maxInput < input){
                    maxInput = input;
                }
            }
        }

        int maxAnswer = 0;
        for(int h = 0; h < maxInput; h++){
            int answer = 0;
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    if(check[i][j] == false && map[i][j] > h){
                        dfsSolve(i, j, h);
                        answer += 1;
                    }
                }
            }

            check = new boolean[N][N];

            if(maxAnswer < answer){
                maxAnswer = answer;
            }
        }

        System.out.println(maxAnswer);
    }

    public static void dfsSolve(int x, int y, int H){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0; i < 4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX < 0 || nextY < 0 || nextX == N || nextY == N){
                continue;
            }

            if(check[nextX][nextY] == false && map[nextX][nextY] > H){
                check[nextX][nextY] = true;
                dfsSolve(nextX, nextY, H);
            }
        }

    }
}
