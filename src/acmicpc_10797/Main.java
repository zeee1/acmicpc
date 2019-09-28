package acmicpc_10797;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int violatedNumber = 0;
        int i = 0;

        while (i < 5){
            int carNumber = scanner.nextInt();

            if(carNumber == day){
                violatedNumber += 1;
            }
            i++;
        }

        System.out.println(violatedNumber);
    }
}
