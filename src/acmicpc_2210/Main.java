package acmicpc_2210;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[][] map;
    public static boolean[][] check;
    public static ArrayList<Integer> numberList = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        map = new int[5][5];
        check = new boolean[5][5];

        for(int i = 0 ; i < 5; i++){
            for(int j = 0; j < 5; j++){
                map[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < 5; i++){
            for(int j = 0; j < 5; j++){
                String[] numberArr = new String[6];
                dfsSolve(i, j, 0, numberArr);
            }
        }

        System.out.println(numberList.size());
    }

    public static void dfsSolve(int x, int y, int depth, String[] numberArr){

        if(depth == 6){
            String number = "";
            for(int i = 0; i < numberArr.length; i++){
                number += numberArr[i];
            }

            int numberInt = Integer.parseInt(number);

            if(!numberList.contains(numberInt)){
                numberList.add(numberInt);
            }

            return;
        }
        numberArr[depth] = String.valueOf(map[x][y]);
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0 ; i < 4 ; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX < 0 || nextY < 0 || nextX == 5 || nextY == 5 || check[nextX][nextY] == true){
                continue;
            }


            dfsSolve(nextX, nextY, depth+1, numberArr);
        }
    }
}
