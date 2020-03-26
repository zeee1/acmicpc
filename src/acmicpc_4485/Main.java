package acmicpc_4485;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] map;
    public static int[][] adj;
    public static PriorityQueue<Cell> pq;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index= 1;
        while (true) {
            N = scanner.nextInt();

            if (N == 0)
                break;

            map = new int[N][N];
            adj = new int[N][N];

            for (int i = 0; i < N; i++) {
                Arrays.fill(adj[i], Integer.MAX_VALUE);
                for (int j = 0; j < N; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }


            int answer = solve();

            System.out.println("Problem "+index+": "+answer);
            index += 1;
        }
    }

    public static int solve(){
        pq = new PriorityQueue();
        adj[0][0] = map[0][0];
        pq.add(new Cell(0, 0, adj[0][0]));
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while(pq.size() > 0){
            Cell poppedCell = pq.poll();
            int x = poppedCell.x;
            int y = poppedCell.y;
            int costSum = poppedCell.costSum;

            for(int i = 0 ; i < 4; i++){
                int nextX = x+dx[i];
                int nextY = y+dy[i];

                if((nextX >= 0 && nextX < N) && (nextY >= 0 && nextY < N)){
                    if(adj[nextX][nextY] > costSum + map[nextX][nextY]){
                        adj[nextX][nextY] = costSum + map[nextX][nextY];
                        pq.add(new Cell(nextX, nextY, adj[nextX][nextY]));
                    }
                }
            }
        }

        return adj[N-1][N-1];
    }

}

class Cell implements Comparable<Cell>{
    public int x;
    public int y;
    public int costSum;

    public Cell(int x, int y, int c){
        this.x = x;
        this.y = y;
        this.costSum =c;
    }

    @Override
    public int compareTo(Cell o) {
        if(this.costSum < o.costSum){
            return -1;
        }
        else{
            return 1;
        }
    }
}
