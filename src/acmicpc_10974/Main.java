package acmicpc_10974;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        boolean[] check = new boolean[N];
        permutation(N, N, list, check);
    }

    public static void permutation(int n, int r, LinkedList<Integer> list, boolean[] check){
        if(list.size() == r){
            for(int i = 0 ; i < r; i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            return;
        }

        for(int i = 0 ; i < n; i++){
            if(check[i] == false){
                check[i] = true;
                list.add(i+1);
                permutation(n, r, list, check);
                check[i] = false;
                list.removeLast();
            }
        }
    }
}
