package acmicpc_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(getResult(n));
    }

    public static int getResult(int testNum){
        if (testNum < 100)
            return testNum;

        int result = 99;

        for(int i = 100; i <= testNum; i++){
            if (isTrue(i)) {
                result += 1;
            }
        }

        return result;
    }

    public static boolean isTrue(int number){
        if(number < 100)
            return true;

        String resultStr = String.valueOf(number);
        int[] numberArr = new int[resultStr.length()];

        for(int i = 0 ; i < numberArr.length; i++){
            numberArr[i] = Integer.parseInt(resultStr.substring(i,i+1));
        }

        int init_diff = numberArr[1]-numberArr[0];

        for(int i = 1 ; i < numberArr.length-1; i++){
            if(numberArr[i+1]-numberArr[i] != init_diff)
                return false;
        }
        return true;
    }
}
