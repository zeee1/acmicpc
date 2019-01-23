package acmicpc_10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testCaseNum = scanner.nextInt();

        for(int i = 0 ; i < testCaseNum; i++){
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int k = 1;
            int verticalIndex = 0;
            int horizontalIndex = 0;
            while(true){
                if((k-1)*H+1 <= N && N <= k*H){
                    verticalIndex = N-(k-1)*H;
                    horizontalIndex = k;
                    break;
                }
                k += 1;
            }

            System.out.printf("%d%02d\n",verticalIndex, horizontalIndex);
        }
    }
}
