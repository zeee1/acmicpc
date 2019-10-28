package acmicpc_5554;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int seconds = 0;

        for(int i = 0 ; i < 4 ; i++){
            int input = scanner.nextInt();

            seconds += input;
        }

        System.out.println(seconds/60);
        System.out.println(seconds%60);
    }
}
