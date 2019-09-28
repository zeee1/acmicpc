package acmicpc_5543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int minimumBurger = scanner.nextInt();

        for(int i = 0 ; i < 2; i++){
            int inputPrice = scanner.nextInt();
            if(inputPrice < minimumBurger){
                minimumBurger = inputPrice;
            }
        }

        int minimumDrink = scanner.nextInt();
        int nextDrink = scanner.nextInt();
        if(minimumDrink > nextDrink){
            minimumDrink= nextDrink;
        }

        System.out.println(minimumDrink+minimumBurger-50);
    }
}
