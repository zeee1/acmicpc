package acmicpc_6603;

import java.util.Scanner;

public class Main {
    public static int K;
    public static int[] numberArray;
    public static int[] combination = new int[6];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            K = scanner.nextInt();

            if(K == 0){
                break;
            }

            numberArray = new int[K];


            for(int i = 0; i < K ; i++){
                numberArray[i] = scanner.nextInt();
            }

            dfs(0, 0);
            System.out.println();
        }
    }

    public static void dfs(int start, int depth){
        if(depth == 6){
            for(int i = 0 ; i < 6; i++){
                System.out.print(combination[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i < K; i++){
            combination[depth] = numberArray[i];
            dfs(i+1, depth+1);
        }
    }
}

