package acmicpc_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println((A+B));
        }
    }
}
