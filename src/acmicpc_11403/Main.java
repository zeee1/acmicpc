package acmicpc_11403;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] map = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        int[][] answer = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            ArrayDeque<Integer> queue = new ArrayDeque<>();

            boolean[] visited = new boolean[N];
            queue.add(i);

            while(!queue.isEmpty()){
                int poppedValue = queue.poll();

                for(int j = 0 ; j < N; j++){
                    if(map[poppedValue][j] == 1 && visited[j]==false){
                        queue.add(j);
                        visited[j] = true;
                        answer[i][j] = 1;
                    }
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }


}