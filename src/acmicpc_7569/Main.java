package acmicpc_7569;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static int H;
    public static int[][][] tomatoBox;
    public static boolean[][][] check;
    public static int emptyCount = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();
        H = scanner.nextInt();

        tomatoBox = new int[H][N][M];
        check = new boolean[H][N][M];

        ArrayDeque<Position> queue = new ArrayDeque();
        for(int k = 0; k < H; k++){
            for(int i = 0 ; i < N; i++){
                for(int j = 0; j < M ; j++){
                    tomatoBox[k][i][j] = scanner.nextInt();

                    if(tomatoBox[k][i][j] == 1){
                        queue.add(new Position(k, i, j, 0));
                        check[k][i][j] = true;
                    }

                    if(tomatoBox[k][i][j] == -1){
                        emptyCount += 1;
                    }
                }
            }
        }

        solveBFS(queue);

    }

    public static void solveBFS(ArrayDeque<Position> queue){
        int count = 0;
        int lastDay = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[] dz = {-1, 1};

        while(!queue.isEmpty()){
            Position poppedPos = queue.poll();
            lastDay = poppedPos.day;
            count += 1;

            for(int i = 0 ; i < 4; i++){
                int nextX = poppedPos.x+dx[i];
                int nextY = poppedPos.y+dy[i];

                if(nextX < 0 || nextY < 0 || nextX == N || nextY == M){
                    continue;
                }

                if(check[poppedPos.z][nextX][nextY] == false && tomatoBox[poppedPos.z][nextX][nextY] == 0){
                    queue.add(new Position(poppedPos.z, nextX, nextY, poppedPos.day+1));

                    check[poppedPos.z][nextX][nextY] = true;
                }
            }

            for(int i = 0; i < 2; i++){
                int nextZ = poppedPos.z+dz[i];

                if(nextZ < 0 || nextZ == H){
                    continue;
                }

                if(check[nextZ][poppedPos.x][poppedPos.y] == false && tomatoBox[nextZ][poppedPos.x][poppedPos.y] == 0){
                    queue.add(new Position(nextZ, poppedPos.x, poppedPos.y, poppedPos.day+1));
                    check[nextZ][poppedPos.x][poppedPos.y] = true;
                }
            }

        }

        if(H*M*N-emptyCount == count){
            System.out.println(lastDay);
        }
        else{
            System.out.println(-1);
        }
    }
}

class Position{
    public int x;
    public int y;
    public int z;
    public int day;

    public Position(int z, int x, int y, int d){
        this.x = x;
        this.y = y;
        this.z = z;
        this.day = d;
    }
}
