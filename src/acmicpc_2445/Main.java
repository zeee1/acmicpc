package acmicpc_2445;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0 ; i < N ; i++)
        {
            String indexString = "";
            for(int j = 0 ; j < i+1; j++)
            {
                indexString+="*";
            }
            for(int j = 0 ; j <(N-i-1); j++){
                indexString+= "  ";
            }
            for(int j = 0 ; j < i+1; j++)
            {
                indexString+="*";
            }

            System.out.println(indexString);
        }
        for(int i = 0 ; i < N ; i++)
        {
            String indexString = "";

            for(int j = 0 ; j <(N-i-1); j++){
                indexString+= "*";
            }
            for(int j = 0 ; j < i+1; j++)
            {
                indexString+="  ";
            }
            for(int j = 0 ; j <(N-i-1); j++){
                indexString+= "*";
            }

            System.out.println(indexString);
        }
    }
}
