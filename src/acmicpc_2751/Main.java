package acmicpc_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(bf.readLine());
        int[] integerArray = new int[inputNumber];
        for(int i = 0 ; i < inputNumber; i++){
            integerArray[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(integerArray);

        for(int i = 0; i < inputNumber; i++){
            System.out.println(integerArray[i]);
        }
    }
}
