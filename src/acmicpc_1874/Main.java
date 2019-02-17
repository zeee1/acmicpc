package acmicpc_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Stack<Integer> integerStack = new Stack<>();
        StringBuffer answer = new StringBuffer();
        boolean hasAnswer = true;
        int indexNum = 1;

        for(int i = 1; i <= N; i++)
        {
            int inputNum = Integer.parseInt(bf.readLine());

            if(integerStack.contains(inputNum))
            {
                if(integerStack.peek() == inputNum){
                    answer.append("-\n");
                    integerStack.pop();
                }
                else{
                    hasAnswer = false;
                }
            }
            else{
                while(indexNum <= inputNum)
                {
                    integerStack.push(indexNum);
                    answer.append("+\n");
                    indexNum += 1;
                }

                integerStack.pop();
                answer.append("-\n");
            }
        }

        if (hasAnswer)
        {
            System.out.println(answer);
        }
        else{
            System.out.println("NO");
        }
    }
}
