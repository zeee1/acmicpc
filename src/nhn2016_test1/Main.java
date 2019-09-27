package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String input = br.readLine();
            String[] numStrList = input.split(" ");

            for(String numStr: numStrList){
                numberList.add(Integer.parseInt(numStr));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(numberList);
        int diff = Integer.MAX_VALUE;
        int answerpos1 = -1;
        int answerpos2 = -1;

        for(int i = 1 ; i < numberList.size(); i++){
            int number_diff = numberList.get(i)-numberList.get(i-1);
            int pos1 = numberList.get(i-1);
            int pos2 = numberList.get(i);

            if(diff > number_diff){
                diff = number_diff;
                answerpos1 = pos1;
                answerpos2 = pos2;
            }
        }

        System.out.println(answerpos1+" "+answerpos2);
    }
}
