package acmicpc_10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testcaseNumber = scanner.nextInt();

        for(int i = 0; i < testcaseNumber ;i++ ){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A+B);
        }
    }
}
