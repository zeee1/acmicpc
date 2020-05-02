package acmicpc_1717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] parent = new int[n+1];
        int m = scanner.nextInt();

        for(int i = 0 ; i <= n ; i++){
            parent[i] = i;
        }

        for(int i = 0 ; i < m; i++){
            int operator = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(operator == 0){
                a = find(parent, a);
                b = find(parent, b);

                if(a != b){
                    if(a > b){
                        parent[a] = b;
                    }
                    else{
                        parent[b] = a;
                    }
                }

            }
            else{
                int finda = find(parent, a);
                int findb = find(parent, b);

                if(finda == findb){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }

    public static int find(int[] parent, int x){
        if(parent[x] == x){
            return x;
        }
        else{
            return find(parent, parent[x]);
        }
    }
}
