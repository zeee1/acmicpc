package acmicpc_5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean[] check = new boolean[30];

        for(int i = 0 ; i < 28 ; i++){
            check[scanner.nextInt()-1] = true;
        }

        for(int i = 0 ; i < 30; i++){
            if(check[i] == false){
                System.out.println(i+1);
            }
        }
    }
}
