package acmicpc_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        A = modifyNumber(A);
        B = modifyNumber(B);

        System.out.println((A>B?A:B));
    }

    public static int modifyNumber(int number){
        int firstNum = number/100;
        int secondNum = (number%100)/10;
        int lastNum = (number%100)%10;

        return (lastNum*100+secondNum*10+firstNum);
    }
}
