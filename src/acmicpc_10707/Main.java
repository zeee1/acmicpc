package acmicpc_10707;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int P = scanner.nextInt();

        int costA = A*P;
        int costB = 0;

        if(P <= C){
            costB = B;
        }else{
            costB = B+D*(P-C);
        }

        System.out.println((int)Math.min(costA, costB));
    }
}
