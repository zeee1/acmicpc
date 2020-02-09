package acmicpc_2163;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int maxInput = Math.max(N, M);
        int minInput = Math.min(N, M);

        int answer = (minInput-1)+(minInput)*(maxInput-1);
        System.out.println(answer);
    }
}
