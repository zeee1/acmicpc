package acmicpc_1427;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        String stringNumber = String.valueOf(inputNum);
        int[] numberArray = new int[stringNumber.length()];

        for(int i = 0 ; i < numberArray.length; i++){
            numberArray[i] = Integer.parseInt(stringNumber.substring(i, i+1));
        }

        Arrays.sort(numberArray);
        String reverse_sorted_str = "";

        for(int i = 0; i < numberArray.length; i++){
            reverse_sorted_str += numberArray[stringNumber.length()-i-1];
        }

        System.out.println(Integer.parseInt(reverse_sorted_str));
    }
}
