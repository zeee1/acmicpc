package acmicpc_1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfPlayers = scanner.nextInt();
        int[] alphabetCount = new int[26];

        for(int i = 0; i < numberOfPlayers; i++){
            String name = scanner.next();
            char startLetter = name.charAt(0);

            alphabetCount[(int)startLetter-97]+=1;
        }
        boolean answer = false;
        for(int i =0; i < 26; i++){
            if(alphabetCount[i] >= 5){
                answer = true;
                System.out.print((char)(i+97));
            }
        }

        if(answer == false){
            System.out.println("PREDAJA");
        }
    }
}
