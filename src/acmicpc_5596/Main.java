package acmicpc_5596;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int S = 0;
        int T = 0;

        for(int i = 0 ; i < 4; i++){
            S += scanner.nextInt();
        }

        for(int i = 0 ; i < 4; i++){
            T += scanner.nextInt();
        }

        System.out.println(Math.max(S, T));
    }
}
