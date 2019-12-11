package acmicpc_5063;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for(int i = 0 ; i < testcaseNumber; i++){
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();

            if(r > (e-c)){
                System.out.println("do not advertise");
            }
            else if(r == (e-c)){
                System.out.println("does not matter");
            }
            else{
                System.out.println("advertise");
            }
        }
    }
}
