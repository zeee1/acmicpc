package acmicpc_1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        int lenDiff = B.length() - A.length();
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0 ; i <= lenDiff; i++){
            int diff = 0;
            for(int j = 0 ; j < A.length(); j++){
                if(A.charAt(j) != B.charAt(i+j)){
                    diff++;
                }
            }

            if(minDiff > diff){
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
}
