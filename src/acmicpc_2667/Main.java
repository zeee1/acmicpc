package acmicpc_2667;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int[][] map;
    public static int N;
    public static boolean[][] isVisit;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new int[N][N];
        isVisit = new boolean[N][N];

        for(int i = 0 ; i < N ; i++){
            String stringNumber = scanner.next();
            for(int j = 0 ; j < N ; j++){
                map[i][j] = Integer.parseInt(stringNumber.substring(j, j+1));
            }
        }

        ArrayList<Integer> groupList = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(map[i][j] == 1 && isVisit[i][j] == false){
                    int count = dfs(i, j);
                    groupList.add(count);
                }
            }
        }

        int[] numberArray = new int[groupList.size()];
        for(int i = 0 ; i < groupList.size(); i++){
            numberArray[i] = groupList.get(i);
        }
        Arrays.sort(numberArray);
        System.out.println(groupList.size());

        for(int i = 0 ; i < groupList.size(); i++){
            System.out.println(numberArray[i]);
        }
    }

    public static int dfs(int x, int y){
        int count = 0;
        Stack<Position> stack = new Stack();
        stack.push(new Position(x, y));
        isVisit[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while(true){
            if(stack.size() == 0){
                break;
            }

            Position poppedPos = stack.pop();
            count += 1;

            for(int i = 0 ; i < 4; i++){
                int nextX = poppedPos.x+dx[i];
                int nextY = poppedPos.y+dy[i];

                if(nextX < 0 || nextY < 0 || nextX == N || nextY == N){
                    continue;
                }
                if(map[nextX][nextY] != 1 || isVisit[nextX][nextY] == true){
                    continue;
                }
                stack.push(new Position(nextX, nextY));
                isVisit[nextX][nextY] = true;
            }
        }

        return count;
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
