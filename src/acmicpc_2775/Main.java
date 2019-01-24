package acmicpc_2775;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseNum = scanner.nextInt();
        int[][] apartment = new int[15][15];
        int numOfPeopleOnbeforeLayer = 0;

        for (int p = 0; p < 15; p++) {
            apartment[0][p] = p;
        }

        for (int j = 1; j < 15; j++) {
            numOfPeopleOnbeforeLayer = 0;
            for (int p = 1; p < 15; p++) {
                numOfPeopleOnbeforeLayer += apartment[j - 1][p];
                apartment[j][p] = numOfPeopleOnbeforeLayer;
            }
        }

        for (int i = 0; i < testcaseNum; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(apartment[k][n]);
        }

    }

}