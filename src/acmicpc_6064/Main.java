package acmicpc_6064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNum = scanner.nextInt();

        for(int i = 0 ; i < testcaseNum; i++){
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            long maxNumber = lcm(M, N);

            int copy_x = x;
            int copy_y = y;
            boolean answerFind = false;

            if (copy_x == copy_y){
                System.out.println(copy_x);
                answerFind = true;
            }
            else if(copy_x > copy_y){
                while(copy_x <= maxNumber){
                    while(copy_y <= copy_x){
                        if (copy_x == copy_y){
                            System.out.println(copy_x);
                            answerFind = true;
                            break;
                        }
                        copy_y += N;
                    }

                    if(answerFind == true){
                        break;
                    }
                    copy_x += M;
                }
            }
            else if(copy_x < copy_y){
                while(copy_y <= maxNumber){
                    while(copy_x <= copy_y){
                        if (copy_x == copy_y){
                            System.out.println(copy_x);
                            answerFind = true;
                            break;
                        }
                        copy_x += M;
                    }

                    if(answerFind == true){
                        break;
                    }
                    copy_y += N;
                }
            }


            if(answerFind == false){
                System.out.println(-1);
            }
        }
    }

    public static long lcm(long a, long b) {
        int gcd_value = gcd((int)a, (int)b);

        if (gcd_value == 0)
            return 0;

        return Math.abs( (a * b) / gcd_value );
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
