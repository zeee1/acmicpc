package acmicpc_10845;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfCMD = scanner.nextInt();

        ArrayDeque<Integer> testQueue = new ArrayDeque<>();

        for(int i = 0 ; i <= numberOfCMD; i++)
        {
            String cmd = scanner.nextLine();
            String[] splited_cmd = cmd.split(" ");

            switch (splited_cmd[0])
            {
                case "push":
                    testQueue.add(Integer.parseInt(splited_cmd[1]));
                    break;
                case "pop":
                    if(testQueue.size() == 0)
                    {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(testQueue.poll());
                    }
                    break;
                case "empty":
                    if(testQueue.isEmpty())
                    {
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(testQueue.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(testQueue.peek());
                    }
                    break;
                case "size":
                    System.out.println(testQueue.size());
                    break;
                case "back":
                    if(testQueue.size() == 0){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(testQueue.getLast());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
