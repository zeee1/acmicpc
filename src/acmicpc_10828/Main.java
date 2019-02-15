package acmicpc_10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfCMD = scanner.nextInt();
        Stack<Integer> testStack = new Stack<>();

        for(int i = 0 ; i <= numberOfCMD; i++)
        {
            String cmd = scanner.nextLine();
            String[] splited_cmd = cmd.split(" ");

            switch (splited_cmd[0])
            {
                case "push":
                    testStack.push(Integer.parseInt(splited_cmd[1]));
                    break;
                case "pop":
                    if(testStack.size() == 0)
                    {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(testStack.pop());
                    }
                    break;
                case "empty":
                    if(testStack.isEmpty())
                    {
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(testStack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(testStack.peek());
                    }
                    break;
                case "size":
                    System.out.println(testStack.size());
                    break;
                default:
                    break;
            }
        }
    }
}
