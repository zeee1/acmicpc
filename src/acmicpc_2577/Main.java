package acmicpc_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int multi_value = A*B*C;

        String value = String.valueOf(multi_value);
        int[] countArr = new int[10];

        for(int i =0;i < value.length(); i++){
            int tempValue = Integer.parseInt(value.substring(i,i+1));
            countArr[tempValue] += 1;
        }

        for(int i = 0; i < countArr.length; i++){
            System.out.println(countArr[i]);
        }
    }
}
