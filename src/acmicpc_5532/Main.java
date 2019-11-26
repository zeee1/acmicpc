package acmicpc_5532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int math = (int)Math.ceil((double)A/(double)C);
        int korean = (int)Math.ceil((double)B/(double)D);

        System.out.println(L-(int)Math.max(math, korean));
    }
}
