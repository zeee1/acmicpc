package acmicpc_4948;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            int N = scanner.nextInt();

            if (N == 0)
            {
                break;
            }

            boolean[] primeArray = new boolean[2*N+1];

            for(int i = 2 ; i < primeArray.length; i++)
            {
                primeArray[i] = true;
            }

            primeArray[0] = false;
            primeArray[1] = false;

            for(int i = 2 ; i*i <= 2*N ; i++)
            {
                for(int j = i*i; j <= 2*N; j+=i)
                {
                    primeArray[j] = false;
                }
            }

            int count = 0;
            for(int i = N+1; i <= 2*N; i++ )
            {
                if(primeArray[i] == true)
                {
                    count += 1;
                }

            }

            System.out.println(count);
        }
    }
}
