package acmicpc_2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] card = new int[N];

        for(int i = 0 ; i < N ; i++){
            card[i] = scanner.nextInt();
        }

        int mindiff = Integer.MAX_VALUE;
        int answer = 0;
        boolean answerfind = false;

        for(int i = 0 ; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    int cardsum = card[i]+card[j]+card[k];

                    if(cardsum > M){
                        continue;
                    }
                    else if(cardsum == M){
                        answer = cardsum;
                        answerfind = true;
                        break;
                    }else{
                        int diff = M-cardsum;

                        if(mindiff > diff){
                            mindiff = diff;
                            answer = cardsum;
                        }
                    }
                }

                if(answerfind)
                    break;
            }
            if(answerfind)
                break;
        }

        System.out.println(answer);
    }
}
