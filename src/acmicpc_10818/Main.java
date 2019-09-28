package acmicpc_10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int maxNum = -1000000;
        int minNum = 1000000;

        for(int i = 0; i < N; i++){
            int inputNumber = scanner.nextInt();

            if (inputNumber > maxNum){
                maxNum = inputNumber;
            }
            else if(inputNumber < minNum){
                minNum = inputNumber;
            }
        }

        System.out.println(minNum +" "+maxNum);
    }
}
