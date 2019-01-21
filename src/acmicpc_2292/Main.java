package acmicpc_2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cellNumber = scanner.nextInt();

        System.out.println(getDistance(cellNumber));
    }

    public static int getDistance(int cellNumber){
        int startNumber = 0;
        int endNumber = 0;
        int distance = 1;

        while(true){
            if (distance == 1){
                startNumber = 1;
                endNumber= 1;
            }
            else{
                startNumber = 3*(int)Math.pow(distance, 2)-9*distance+8;
                endNumber = 3*(int)Math.pow(distance,2)-3*distance+1;
            }

            if(cellNumber >= startNumber && cellNumber <= endNumber){
                break;
            }
            distance += 1;
        }

        return distance;
    }
}
