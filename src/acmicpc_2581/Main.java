package acmicpc_2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int primeNumberSum = 0;
        int minPrimeNumber = 0;
        while(M <= N){
            int count = 0;
            for(int i = 1; i <= M; i++){
                if(M%i == 0){
                    count += 1;
                    if(count > 2){
                        break;
                    }
                }

            }

            if (count == 2){
                if (minPrimeNumber == 0){
                    minPrimeNumber = M;
                }
                primeNumberSum += M;
            }
            M += 1;
        }

        if(minPrimeNumber == 0 && primeNumberSum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(primeNumberSum);
            System.out.println(minPrimeNumber);
        }
    }
}
