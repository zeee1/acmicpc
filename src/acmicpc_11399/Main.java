package acmicpc_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] arrays = new int[number];

        for(int i = 0 ; i < number; i++){
            arrays[i] = scanner.nextInt();
        }

        Arrays.sort(arrays);
        int sum = 0;
        int waitingsum = 0;
        for(int i = 0 ; i < number; i++){
            waitingsum += (sum+arrays[i]);
            sum = (sum+arrays[i]);
        }

        System.out.println(waitingsum);
    }
}
