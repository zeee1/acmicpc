package acmicpc_2455;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = 0;
        int maxNumber = 0;

        for(int i = 0 ; i < 4; i++){
            int output = scanner.nextInt();
            int input = scanner.nextInt();

            numberOfPeople -= output;
            numberOfPeople += input;

            if(maxNumber < numberOfPeople){
                maxNumber = numberOfPeople;
            }
        }

        System.out.println(maxNumber);
    }
}
