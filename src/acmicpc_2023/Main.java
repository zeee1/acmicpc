package acmicpc_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int N;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        for(int i = 1; i <= 9; i++){
            if(isPrimeNumber(i)){
                dfsSolve(1, i);
            }
        }
    }

    public static void dfsSolve(int depth, int number){

        if(depth == N){
            System.out.println(number);

            return;
        }

        for(int i = 0 ; i <= 9; i++){
            int currentNumber = 10*number+i;

            if(isPrimeNumber(currentNumber)){
                dfsSolve(depth+1, currentNumber);
            }
        }
    }


    public static boolean isPrimeNumber(int N){
        int count = 0;

        for(int i = 1 ; i <= N; i++){
            if(N%i == 0){
                count += 1;
            }

            if(count > 2){
                return false;
            }
        }

        if(count == 2)
            return true;
        return false;
    }
}
