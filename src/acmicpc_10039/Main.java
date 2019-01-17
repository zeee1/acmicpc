package acmicpc_10039;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum_score = 0;

        for(int i = 0 ; i < 5; i++){
            int score = scanner.nextInt();

            if(score < 40){
                sum_score += 40;
            }
            else{
                sum_score += score;
            }
        }

        System.out.println(sum_score/5);
    }
}
