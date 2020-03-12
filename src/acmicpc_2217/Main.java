package acmicpc_2217;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] ropeWeight = new int[N];

        for(int i = 0 ;  i < N ; i++){
            ropeWeight[i] = scanner.nextInt();
        }
        Arrays.sort(ropeWeight);

        int answer = Integer.MIN_VALUE;

        for(int i = 0 ; i < N; i++){
            int indexWeight = ropeWeight[i];
            int availableWeight = indexWeight*(N-i);

            if(availableWeight > answer){
                answer = availableWeight;
            }
        }


        System.out.println(answer);
    }
}
