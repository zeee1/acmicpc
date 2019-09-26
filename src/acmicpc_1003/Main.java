package acmicpc_1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNum = scanner.nextInt();
        int[] DP_0 = new int[41];
        int[] DP_1 = new int[41];

        DP_0[0] = 1;
        DP_1[0] = 0;

        DP_0[1] = 0;
        DP_1[1] = 1;

        for(int i = 2 ; i < DP_0.length; i++){
            DP_0[i] = DP_0[i-1]+DP_0[i-2];
            DP_1[i] = DP_1[i-1]+DP_1[i-2];
        }

        for(int i = 0 ; i < testcaseNum ; i++){
            int N = scanner.nextInt();
            System.out.println(DP_0[N]+" "+DP_1[N]);
        }
    }
}
