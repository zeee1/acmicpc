package acmicpc_3034;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();

        for(int i = 0 ; i < N ; i++){
            int input = scanner.nextInt();

            if(input <= Math.sqrt(W*W+H*H)){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
