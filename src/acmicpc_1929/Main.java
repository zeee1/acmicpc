package acmicpc_1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        boolean[] primeArray = new boolean[N+1];

        for(int i = 2 ; i < primeArray.length; i++)
        {
            primeArray[i] = true;
        }

        primeArray[0] = false;
        primeArray[1] = false;

        for(int i = 2 ; i*i <= N ; i++)
        {
            for(int j = i*i; j <= N; j+=i)
            {
                primeArray[j] = false;
            }
        }

        for(int i = M; i <= N; i++ )
        {
            if(primeArray[i] == true)
            {
                System.out.println(i);
            }

        }
    }
}
