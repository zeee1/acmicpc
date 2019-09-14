package acmicpc_11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for(int i = 1; i <= testcaseNumber ;i++ ){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println("Case #"+i+": "+A+" + "+B +" = "+(A+B));
        }
    }
}
