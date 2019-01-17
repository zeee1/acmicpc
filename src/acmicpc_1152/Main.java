package acmicpc_1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        String[] splitedInput = input.split(" ");
        for(int i = 0 ; i < splitedInput.length; i++){
            if(splitedInput[i].length() > 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
