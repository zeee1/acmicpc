package acmicpc_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testcaseNum = scanner.nextInt();

        for(int i = 0 ; i < testcaseNum; i++){
            int repeatNum = scanner.nextInt();
            String targetStr = scanner.next();

            String newlyAssembledStr = "";

            for(int j = 0 ; j < targetStr.length(); j++){
                String crnt_letter = targetStr.substring(j, j+1);
                int count = 0;
                while(count < repeatNum){
                    newlyAssembledStr += crnt_letter;
                    count += 1;
                }
            }
            System.out.println(newlyAssembledStr);
        }
    }
}
