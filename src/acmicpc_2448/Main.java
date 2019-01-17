package acmicpc_2448;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] map = new String[n];
        map[0] = "  *  ";
        map[1] = " * * ";
        map[2] = "*****";

        drawTree(n, map);

        for (int i = 0; i < n; ++i) {
            System.out.println(map[i]);
        }
    }

    public static void drawTree(int inputN, String[] map){
        for(int i = 1; 3*Math.pow(2, i) <= inputN; i++){
            int bottomIndex = (int)(3*Math.pow(2, i));
            int middleIndex = bottomIndex/2;
            bottomIndex -= 1;

            for(int j = middleIndex; j <= bottomIndex; j++){
                map[j] = map[j-middleIndex]+" "+map[j-middleIndex];
            }

            String space = "";
            while (space.length() < middleIndex) {
                space += " ";
            }
            for (int j = 0; j < middleIndex; ++j) {
                map[j] = space + map[j] + space;
            }
        }

    }
}
