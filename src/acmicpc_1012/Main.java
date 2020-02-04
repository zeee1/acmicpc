package acmicpc_1012;

import java.util.Scanner;

public class Main {
    public static int[][] map;
    public static int M;
    public static int N;
    public static int K;
    public static boolean[][] check;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for(int i = 0; i < testcaseNumber; i++){
            M = scanner.nextInt();
            N = scanner.nextInt();
            K = scanner.nextInt();

            map = new int[N][M];

            for(int j = 0 ; j < K; j++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                map[y][x] = 1;
            }

            check = new boolean[N][M];

            int answer = 0;
            for(int k = 0 ; k < N ; k++){
                for(int p= 0 ; p < M; p++){
                    if(map[k][p] == 1 && check[k][p] == false){
                        check[k][p] = true;
                        dfs(k, p);
                        answer += 1;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    public static void dfs(int x, int y){
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0 ; i < 4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M){
                continue;
            }
            if(map[nextX][nextY] == 1 && check[nextX][nextY] == false){
                check[nextX][nextY] = true;
                dfs(nextX, nextY);

            }
        }
    }
}


