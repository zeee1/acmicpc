package acmicpc_1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arrayA = new int[N];
        int[] arrayB = new int[N];

        for(int i = 0 ;  i < N ; i++){
            arrayA[i] = scanner.nextInt();
        }

        for(int i = 0 ;  i < N ; i++){
            arrayB[i] = scanner.nextInt();
        }

        int[] tmpArray = new int[N];

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for(int i = 0 ; i < N ; i++){
            tmpArray[i] = arrayB[N-1-i];
        }

        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            answer += arrayA[i]*tmpArray[i];
        }

        System.out.println(answer);
    }
}
