package acmicpc_4153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            if(n1 == 0 && n2 == 0 && n3 == 0){
                break;
            }

            int maxNumber = Math.max(n1, n2);
            maxNumber = Math.max(maxNumber, n3);
            boolean check = false;

            if(maxNumber == n1){
                if(Math.pow(n2, 2)+Math.pow(n3, 2) == Math.pow(n1,2)){
                    check = true;
                }
            }else if(maxNumber == n2){
                if(Math.pow(n1, 2)+Math.pow(n3, 2) == Math.pow(n2,2)){
                    check = true;
                }
            }else{
                if(Math.pow(n1, 2)+Math.pow(n2, 2) == Math.pow(n3,2)){
                    check = true;
                }
            }

            if(check){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }

        }
    }
}
