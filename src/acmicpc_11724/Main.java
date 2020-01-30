package acmicpc_11724;

import java.util.Scanner;

public class Main {

    public static int[][] map;
    public static boolean[] isVisit;
    public static int N;
    public static int M;
    public static int visitCount = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        map = new int[N][N];
        isVisit = new boolean[N];

        for(int i = 0 ; i < M; i++){
            int startVertex = scanner.nextInt();
            int endVertex = scanner.nextInt();

            map[startVertex-1][endVertex-1] = 1;
            map[endVertex-1][startVertex-1] = 1;
        }
        int answer = 0;

        for(int i = 0; i < N ; i++){
            if(isVisit[i] == true){
                continue;
            }

            dfs(i);
            answer += 1;
        }

        System.out.println(answer);
    }

    public static void dfs(int vertex){
        isVisit[vertex] = true;

        for(int i = 0 ; i < N ; i++){
            if(map[vertex][i] == 1 && isVisit[i] == false){
                dfs(i);
            }
        }
    }

}
