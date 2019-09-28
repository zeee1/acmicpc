package acmicpc_5585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int pay = scanner.nextInt();
        int rest = 1000-pay;

        int[] coinArray = {500, 100, 50, 10, 5, 1};
        int coinIndex = 0;
        int coinCount = 0;

        while (rest > 0){
            if(rest < coinArray[coinIndex]){
                coinIndex += 1;
                continue;
            }

            rest -= coinArray[coinIndex];

            if(rest < coinArray[coinIndex]){
                coinIndex += 1;
            }

            coinCount+=1;
        }

        System.out.println(coinCount);
    }
}
