package acmicpc_7576;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static int[][] boxArray;
    public static boolean[][] isVisit;
    public static int M;
    public static int N;
    public static int emptyCount = 0;
    public static int oneCount = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();

        boxArray = new int[N][M];
        isVisit = new boolean[N][M];


        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M ; j++){
                boxArray[i][j] = scanner.nextInt();
                if(boxArray[i][j] == -1){
                    emptyCount += 1;
                }

                if(boxArray[i][j] == 1){
                    oneCount += 1;
                }
            }
        }

        int minAnswer = Integer.MAX_VALUE;
        ArrayDeque<Position> queueList = new ArrayDeque<>();
        if(oneCount == (M*N-emptyCount)){
            minAnswer = 0;
        }
        else{
            for(int i = 0 ; i < N ; i++){
                for(int j = 0; j < M ; j++){
                    if(boxArray[i][j] == 0 || boxArray[i][j] == -1){
                        continue;
                    }

                    queueList.add(new Position(i, j, 0));
                    isVisit[i][j] = true;
                }
            }

            int answer = bfs(queueList);

            if(answer < minAnswer){
               minAnswer = answer;
            }
        }


        System.out.println(minAnswer);
    }

    public static int bfs(ArrayDeque<Position> queueList){
        int answer = 0;
        int visitCount = queueList.size();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while(true){
            if(queueList.size() == 0){
                break;
            }

            Position poppedPos = queueList.poll();
            answer = poppedPos.day;


            for(int i = 0 ; i < 4; i++){
                int nextX = poppedPos.x + dx[i];
                int nextY = poppedPos.y + dy[i];

                if(nextX < 0 || nextY < 0 || nextX == N || nextY == M){
                    continue;
                }
                if(isVisit[nextX][nextY] == true){
                    continue;
                }
                if(boxArray[nextX][nextY] == -1){
                    continue;
                }
                queueList.add(new Position(nextX, nextY, poppedPos.day+1));
                isVisit[nextX][nextY] = true;
                visitCount += 1;
            }
        }

        if(visitCount < (M*N-emptyCount)){
            answer = -1;
        }
        return answer;
    }
}

class Position{
    public int x;
    public int y;
    public int day;

    public Position(int x, int y, int day){
        this.x = x;
        this.y = y;
        this.day = day;
    }
}
