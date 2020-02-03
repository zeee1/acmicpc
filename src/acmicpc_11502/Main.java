package acmicpc_11502;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] packNumber = new int[N+1];

        for(int i = 1 ; i <= N ; i++){
            packNumber[i] = scanner.nextInt();
        }

        int[] answer = new int[N+1];
        answer[0] = 0;
        answer[1] = packNumber[1];

        for(int i = 2 ; i <= N ; i++){
            answer[i] = packNumber[i];
            for(int j = 1; j < i ; j++){

                answer[i] = Math.max(answer[i], answer[j]+answer[i-j]);
            }
        }

        System.out.println(answer[N]);
    }
}
