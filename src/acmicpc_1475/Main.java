package acmicpc_1475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        String inputStrNum = String.valueOf(inputNumber);
        int[] numberCount = new int[10];

        for(int i = 0 ; i < inputStrNum.length(); i++){
            numberCount[Integer.parseInt(inputStrNum.substring(i, i+1))] += 1;
        }

        int result = numberCount[0];
        numberCount[6] += numberCount[9];
        numberCount[6] = (int)Math.ceil((double)numberCount[6]/(double)2);

        for(int i = 1 ; i < 9 ; i++){
            if(numberCount[i] > result){
                if(result == 0){
                    result = numberCount[i];
                }
                else{
                    result += (numberCount[i]-result);
                }

            }
        }

        System.out.println(result);
    }
}
