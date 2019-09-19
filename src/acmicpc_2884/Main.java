package acmicpc_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M >= 45){
            M = M-45;
        }
        else{
            M = M+15;

            if(H == 0){
                H = 23;
            }
            else{
                H = H-1;
            }

        }

        System.out.println(H+" "+M);
    }
}
