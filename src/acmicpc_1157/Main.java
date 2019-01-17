package acmicpc_1157;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String targetStr = scanner.nextLine();

        int[] countByChar = new int[26];
        for(int i = 0 ; i < targetStr.length();i++){
            char crnt_char = targetStr.charAt(i);

            if((int)crnt_char >= 97){
                countByChar[(int)crnt_char-97] += 1;
            }
            else{
                countByChar[(int)crnt_char-65] += 1;
            }
        }

        int maxValue = Arrays.stream(countByChar).max().getAsInt();
        int rememberIndex = 0;
        int maxValueCount = 0;
        for(int i = 0 ; i <  countByChar.length; i++){
            if(countByChar[i] == maxValue){
                rememberIndex = i;
                maxValueCount += 1;
            }
        }

        if(maxValueCount > 1){
            System.out.println("?");
        }
        else{
            System.out.println((char)(65+rememberIndex));
        }
    }
}
