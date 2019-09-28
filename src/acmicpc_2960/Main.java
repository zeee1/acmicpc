package acmicpc_2960;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        ArrayDeque<Integer> numberQueue = new ArrayDeque<>();

        int count = 0;

        for(int i = 2; i <= N ; i++){
            numberQueue.add(i);
        }
        int P = 2;
        Iterator it = numberQueue.iterator();

        while(true){
            int number = (int)(it.next());
            if(number % P == 0){
                it.remove();
                count += 1;

                if(count == K){
                    System.out.println(number);
                    break;
                }
            }

            if(!it.hasNext()){
                while(true){
                    P += 1;

                    if(isPrimeNumber(P)){
                        break;
                    }
                }
                it = numberQueue.iterator();
            }
        }
    }

    public static boolean isPrimeNumber(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if (number%i == 0){
                count += 1;
            }
        }

        if(count == 2){
            return true;
        }

        return false;
    }
}
