package acmicpc_2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int inputNumber = input.nextInt();
        ArrayList<Integer> inputList = new ArrayList<>();
        for(int i = 0 ; i < inputNumber; i++){
            inputList.add(input.nextInt());
        }

        Collections.sort(inputList);
        for(int i = 0; i < inputNumber; i++){
            System.out.println(inputList.get(i));
        }
    }
}
