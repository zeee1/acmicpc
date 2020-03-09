package acmicpc_1987;

import java.util.Scanner;

public class Main {
    public static int R;
    public static int C;
    public static char[][] board;
    public static boolean[] check;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();
        C = scanner.nextInt();
        board = new char[R][C];
        check = new boolean[26];

        for(int i = 0 ; i < R; i++){
            String input = scanner.next();

            for(int j = 0 ; j < C; j++){
                board[i][j] = input.charAt(j);
            }
        }

        check[board[0][0]-'A'] = true;
        int answer = solve(0,0);

        System.out.println(answer);
    }

    public static int solve(int x, int y){
        boolean hasNext = false;
        int maxAnswer = 0;


        if(x == R-1 && y == C-1){
            return 1;
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0 ; i < 4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];

            if(nextX < 0 || nextY < 0 || nextX == R || nextY == C){
                continue;
            }

            if(check[board[nextX][nextY]-'A'] == false){
                hasNext = true;

                check[board[nextX][nextY]-'A'] = true;
                int answer = solve(nextX, nextY)+1;

                check[board[nextX][nextY]-'A'] = false;
                if(answer > maxAnswer){
                    maxAnswer = answer;
                }
            }
        }

        if(hasNext == false)
            return 1;


        return maxAnswer;
    }
}
