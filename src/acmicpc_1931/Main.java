package acmicpc_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] timeArray = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            timeArray[i][0] = scanner.nextInt();
            timeArray[i][1] = scanner.nextInt();
        }

        Arrays.sort(timeArray, (a, b) -> a[1] == b[1]? a[0]-b[0]: a[1]-b[1]);

        int count = 0;
        int prev_endTime = -1;
        for(int i = 0 ; i < N ; i++){

            if(prev_endTime <= timeArray[i][0]){
                prev_endTime = timeArray[i][1];
                count += 1;
            }
        }

        System.out.println(count);
    }
}
