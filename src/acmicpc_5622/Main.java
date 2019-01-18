package acmicpc_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String strValue = scanner.next();

        String[] charInNumber = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS","TUV", "WXYZ"};
        int[] phoneNumber = new int[strValue.length()];

        for(int i = 0 ; i < strValue.length();i++){
            String crnt_char = strValue.substring(i, i+1);

            for(int j = 0 ; j < charInNumber.length; j++){
                if(charInNumber[j].contains(crnt_char)){
                    phoneNumber[i] = j;
                    break;
                }
            }
        }

        int total_second = 0;
        for(int i = 0 ; i < phoneNumber.length; i++){
            total_second += (phoneNumber[i]+1);
        }
        System.out.println(total_second);
    }
}
