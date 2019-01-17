package acmicpc_1316;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int testcaseNum = scanner.nextInt();
        int result = 0;

        for(int i = 0 ; i < testcaseNum; i++){
            ArrayList<Character> prev_letter_list = new ArrayList<>();
            boolean isExist_prev = false;
            char prev_char = '-';

            String word = scanner.next();
            for(int k = 0 ; k < word.length(); k++){
                char crnt_letter = word.charAt(k);

                if(prev_char != crnt_letter){
                    for(int j = 0 ; j < prev_letter_list.size(); j++){
                        if(prev_letter_list.get(j) == crnt_letter){
                            isExist_prev = true;
                        }
                    }

                    if(isExist_prev == false){
                        prev_letter_list.add(crnt_letter);
                    }
                }
                prev_char = crnt_letter;
            }

            if(isExist_prev == false){
                result += 1;
            }
        }

        System.out.println(result);
    }
}
