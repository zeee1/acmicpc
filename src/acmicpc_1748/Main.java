package acmicpc_1748;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long answer = 0;
        long unit = 10;
        long unitLen = 2;

        for(int i = 1 ; i <= N ;i++){
            if(i < 10){
                answer += 1;
            }
            else{
                long division = i/unit;
                if(division >= 1 && division <= 9){
                    answer += unitLen;
                }
                else{
                    unit *= 10;
                    unitLen += 1;
                    answer += unitLen;
                }
            }
        }

        System.out.println(answer);
    }
}
