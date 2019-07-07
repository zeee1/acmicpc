package acmicpc_1260;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int vertexNumber = scanner.nextInt();
        int edgeNumber = scanner.nextInt();
        int startVertex = scanner.nextInt();
        boolean[] check = new boolean[vertexNumber];

        for(int i = 0 ; i < check.length; i++){
            check[i] = false;
        }

        int[][] map = new int[vertexNumber][vertexNumber];

        for(int i = 0 ; i < edgeNumber ; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            map[start-1][end-1] = 1;
            map[end-1][start-1] = 1;
        }

        DFS(map, check, startVertex-1);
        System.out.println();
        BFS(map, startVertex-1);
    }


    public static void DFS(int[][] map, boolean[] check,  int startVertex)
    {
//        Stack<Integer> nextHopStack = new Stack<>();
//        boolean[] visited = new boolean[map.length];
//
//        for(int i = 0 ; i < map.length; i++)
//        {
//            visited[i] = false;
//        }
//
//        nextHopStack.push(startVertex-1);
//        visited[startVertex-1] = true;
//        while(!nextHopStack.isEmpty())
//        {
//            int currentVertex = nextHopStack.pop();
//
//            for(int i = map.length-1 ; i >= 0 ; i--)
//            {
//                if(map[currentVertex][i] == 1 && visited[i] == false){
//                    nextHopStack.push(i);
//                    visited[i] = true;
//                }
//            }
//
//            if(nextHopStack.isEmpty()){
//                System.out.println((currentVertex+1));
//            }
//            else{
//                System.out.print((currentVertex+1)+" ");
//            }
//        }

        System.out.print((startVertex+1)+" ");
        int currentVertex = startVertex;
        check[currentVertex] = true;

        for(int i = 0 ; i < map.length; i++)
        {
            if(map[currentVertex][i] == 1 && check[i] == false)
            {
                DFS(map, check, i);
            }
        }
    }

    public static void BFS(int[][] map, int startVertex)
    {
        ArrayDeque<Integer> nextHopQueue = new ArrayDeque<>();
        boolean[] visited = new boolean[map.length];

        for(int i = 0 ; i < map.length; i++)
        {
            visited[i] = false;
        }

        nextHopQueue.add(startVertex);
        visited[startVertex] = true;

        while(!nextHopQueue.isEmpty())
        {
            int currentVertex = nextHopQueue.pop();

            for(int i = 0 ; i < map.length; i++)
            {
                if(map[currentVertex][i] == 1 && visited[i] == false)
                {
                    nextHopQueue.add(i);
                    visited[i] = true;
                }
            }

            if(nextHopQueue.isEmpty()){
                System.out.println((currentVertex+1));
            }
            else{
                System.out.print((currentVertex+1)+" ");
            }

        }
    }
}
