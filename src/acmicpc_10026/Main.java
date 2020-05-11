package acmicpc_10026;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] map;
    public static boolean[][] check;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new int[N][N];
        check = new boolean[N][N];

        for(int i = 0 ; i < N ; i++){
            String input = scanner.next();

            for(int j = 0 ; j < N ; j++){
                if(input.substring(j, j+1).equals("R")){
                    map[i][j] = 0;
                }
                else if(input.substring(j, j+1).equals("G")){
                    map[i][j] = 1;
                }else{
                    map[i][j] = 2;
                }
            }
        }

        int answerA = countNumOfSectionByTypeA();
        check = new boolean[N][N];
        int answerB = countNumOfSectionByTypeB();

        System.out.println(answerA +" "+answerB);
    }

    public static int countNumOfSectionByTypeA(){
        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < N ; j++){
                if(check[i][j] == false){
                    setcheck(map[i][j], i , j);
                    answer +=1;
                }
            }
        }

        return answer;
    }

    public static void setcheck(int value, int x, int y){
        ArrayDeque<Position> queue = new ArrayDeque<>();

        queue.add(new Position(x, y));

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while(true){
            if(queue.size() == 0){
                break;
            }

            Position popped = queue.poll();

            for(int i = 0 ; i < 4; i++){
                int nextX= popped.x +dx[i];
                int nextY = popped.y + dy[i];

                if(nextX < 0 || nextY < 0 || nextX == N || nextY == N || check[nextX][nextY] == true){
                    continue;
                }

                if(map[nextX][nextY] == value){
                    check[nextX][nextY] = true;
                    queue.add(new Position(nextX, nextY));
                }

            }


        }
    }

    public static int countNumOfSectionByTypeB(){

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(map[i][j] == 1){
                    map[i][j] = 0;
                }
            }
        }
        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < N ; j++){
                if(check[i][j] == false){
                    setcheck(map[i][j], i , j);
                    answer +=1;
                }
            }
        }

        return answer;
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