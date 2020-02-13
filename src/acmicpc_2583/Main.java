package acmicpc_2583;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][] map;
    public static boolean[][] check;
    public static int M;
    public static int N;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();
        int K = scanner.nextInt();

        map = new int[M][N];
        check = new boolean[M][N];

        for(int i = 0 ; i < K ; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int w = scanner.nextInt();
            int z = scanner.nextInt();

            int W = w-x;
            int H = z-y;

            int startX = M-z;
            int startY = x;
            int endX = startX+H;
            int endY = startY+W;

            for(int k = startX; k < endX; k++){
                for(int p = startY; p < endY; p++){
                    map[k][p] = 1;
                    check[k][p] = true;
                }
            }
        }

        ArrayList<Integer> sizeList = new ArrayList<>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 0 && check[i][j] == false){
                    int spaceSize = bfs(i, j);
                    sizeList.add(spaceSize);
                }
            }
        }

        int[] sizeArray = new int[sizeList.size()];

        for(int i = 0 ;  i < sizeArray.length; i++){
            sizeArray[i] = sizeList.get(i);
        }
        Arrays.sort(sizeArray);
        System.out.println(sizeList.size());
        for(int i = 0 ; i < sizeList.size(); i++){
            System.out.print(sizeArray[i]+" ");
        }
    }

    public static int bfs(int x, int y){
        int size = 0;
        ArrayDeque<Position> queue = new ArrayDeque<>();
        queue.add(new Position(x, y));
        check[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while(true){

            if(queue.size() == 0){
                break;
            }

            Position poppedPos = queue.poll();
            size += 1;

            for(int i = 0; i < 4 ; i++){
                int nextX = poppedPos.x+dx[i];
                int nextY = poppedPos.y+dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N){
                    continue;
                }

                if(map[nextX][nextY] == 0 && check[nextX][nextY] == false){
                    queue.add(new Position(nextX, nextY));
                    check[nextX][nextY] = true;
                }
            }
        }

        return size;
    }
}

class Position{
    public int x;
    public int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}