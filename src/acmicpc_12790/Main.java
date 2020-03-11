package acmicpc_12790;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for(int i = 0 ; i < testcaseNumber; i++){
            int dHP = scanner.nextInt();
            int dMP = scanner.nextInt();
            int dA = scanner.nextInt();
            int dB = scanner.nextInt();

            int vHP = scanner.nextInt();
            int vMP = scanner.nextInt();
            int vA = scanner.nextInt();
            int vB = scanner.nextInt();

            int HP = dHP+vHP;
            int MP = dMP+vMP;
            int A = dA+vA;
            int B = dB+vB;

            if(HP < 1){
                HP = 1;
            }
            if (MP < 1){
                MP = 1;
            }
            if(A < 0){
                A = 0;
            }

            System.out.println(HP+5*MP+2*A+2*B);
        }

    }
}
