package acmicpc_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        int maxValue = 0;
        int maxValueIndex = 0;
        for (int i = 0 ; i < array.length; i++){
            array[i] = scanner.nextInt();

            if(maxValue < array[i]){
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxValueIndex+1);

    }
}
