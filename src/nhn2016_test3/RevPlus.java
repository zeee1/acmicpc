package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevPlus {
    public static void main(String[] args){
        int number = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line = br.readLine();
            number = Integer.parseInt(line);
        }catch (IOException e){
            e.printStackTrace();
        }

        boolean isRev = false;

        for(int i = 0 ; i < 3; i++){
            int revNumber = revNumber(number);
            number += revNumber;

            if(checkRev(number)){
                System.out.println(number);
                isRev = true;
                break;
            }
        }

        if(isRev == false){
            System.out.println(-1);
        }
    }

    public static int revNumber(int number){
        String strNumber = String.valueOf(number);
        String returnNumber = "";

        for(int i = strNumber.length()-1 ; i >= 0; i--){
            returnNumber += strNumber.charAt(i);
        }

        return Integer.parseInt(returnNumber);
    }

    public static boolean checkRev(int number){
        if(revNumber(number) == number)
            return true;
        return false;
    }
}
