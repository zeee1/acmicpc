package acmicpc_1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        while(M <= N){
            int count = 0;
            for(int i = 1; i <=M ; i++){
                if (M%i == 0){
                    count += 1;
                    if(count > 2){
                        break;
                    }
                }
            }

            if(count == 2){
                System.out.println(M);
            }
            M += 1;
        }
    }
}
