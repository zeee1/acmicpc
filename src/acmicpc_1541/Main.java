package acmicpc_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] splitedInput = input.split("\\-");

        int answer = 0;

        for(int i = 0 ; i < splitedInput.length; i++){
            String[] splitByPlus = splitedInput[i].split("\\+");


            int sum = 0;
            for(int j =0 ; j < splitByPlus.length; j++){
                int number = Integer.parseInt(splitByPlus[j]);

                sum += number;
            }

            if(i == 0)
            {
                answer = sum;
            }
            else
            {
                answer -= sum;
            }
        }


        System.out.println(answer);
    }
}

