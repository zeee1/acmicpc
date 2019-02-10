package acmicpc_1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 0;

        for(int i = 0 ; i < N; i++){
            int testNum = scanner.nextInt();
            int count = 0;
            for(int j = 1; j <= testNum; j++){
                if(testNum % j == 0){
                    count += 1;
                }
            }

            if (count == 2){
                result += 1;
            }
        }

        System.out.println(result);
    }
}
