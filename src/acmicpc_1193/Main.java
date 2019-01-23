package acmicpc_1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println(getResult(index));
    }

    public static String getResult(int inputNumber){
        int count = 1;
        int rangeStart = 0;
        int rangeEnd = 0;
        String result = "";

        while(true){
            if (count > 1){
                rangeStart = (count-1)*count/2+1;
                rangeEnd = (count+1)*count/2;

                if(inputNumber >= rangeStart && inputNumber <= rangeEnd){
                    int rangeIndex = inputNumber - rangeStart;
                    if (count % 2 == 1){
                       result = String.valueOf(count-rangeIndex)+"/"+String.valueOf(rangeIndex+1);
                    }
                    else{
                        result = String.valueOf(rangeIndex+1)+"/"+String.valueOf(count-rangeIndex);
                    }
                    break;
                }
            }

            count+= 1;
        }

        return result;
    }
}
