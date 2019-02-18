package acmicpc_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestcase = Integer.parseInt(bf.readLine());

        for(int i = 0 ;i < numberOfTestcase; i++)
        {
            boolean hasAnswer = true;
            String input = bf.readLine();
            Stack<String> stack = new Stack<>();

            for(int j = 0 ; j < input.length(); j++)
            {
                String indexChar = input.substring(j, j+1);

                if(indexChar.equals("("))
                {
                    stack.push(indexChar);
                }
                else{
                    if(stack.size() > 0)
                    {
                        stack.pop();

                    }
                    else{
                        hasAnswer = false;
                        break;
                    }
                }

                if(j == input.length()-1 && stack.size() > 0)
                {
                    hasAnswer = false;
                }
            }

            if(hasAnswer == false){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}
