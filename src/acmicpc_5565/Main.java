package acmicpc_5565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalprice = scanner.nextInt();

        for(int i = 0 ; i < 9 ; i++){
            int price = scanner.nextInt();

            totalprice -= price;
        }

        System.out.println(totalprice);
    }
}
