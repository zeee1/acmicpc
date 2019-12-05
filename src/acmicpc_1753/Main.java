package acmicpc_1753;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int startVertex = scanner.nextInt();
        boolean[] visited = new boolean[V+1];

        int[] distance = new int[V+1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        ArrayList<ArrayList<Node>> graph = new ArrayList();

        for(int i = 0 ; i < V+1; i++){
            graph.add(new ArrayList<Node>());
        }

        distance[startVertex] = 0;

        for(int i = 0 ; i < E ; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();


            graph.get(u).add(new Node(v, w));
        }

        PriorityQueue<Node> pq = new PriorityQueue();
        pq.offer(new Node(startVertex, 0));

        while(!pq.isEmpty()){
            Node poppedV = pq.poll();

            int listSize = graph.get(poppedV.vertex).size();

            for(int i = 0 ; i < listSize; i++){
                Node nextNode = graph.get(poppedV.vertex).get(i);

                // distance update
                distance[nextNode.vertex] = Math.min(distance[nextNode.vertex], nextNode.weight+distance[poppedV.vertex]);
                // add new node to pq
                if (visited[i] == false){
                    pq.offer(new Node(nextNode.vertex, distance[nextNode.vertex]));
                    visited[poppedV.vertex] = true;

                }

            }
        }

        for(int i = 1 ; i < V+1; i++){
            if(distance[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }
            else{
                System.out.println(distance[i]);
            }
        }
    }
}

class Node implements Comparable<Node>{
    public int vertex;
    public int weight;

    public Node(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight <= o.weight? 1: -1;
    }
}
