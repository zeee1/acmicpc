package acmicpc_11727;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] answer = new int[N+1];
        answer[0] = 0;
        answer[1] = 1;


        if(N >= 2){
            answer[2] = 3;
            for(int i = 3; i <= N ; i++){
                answer[i] = (answer[i-1]+answer[i-2]*2)%10007;
            }
        }

        System.out.println(answer[N]%10007);
    }
}
