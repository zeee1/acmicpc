package acmicpc_9020;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testCaseNum = scanner.nextInt();

        for(int i = 0 ; i < testCaseNum; i++)
        {
            int N = scanner.nextInt();

            ArrayList<Integer> primeNumberList = getPrimeNumberList(N);
            ArrayList<Node> answerList = new ArrayList<>();

            boolean[] isUsed = new boolean[primeNumberList.get(primeNumberList.size()-1)];
            for(int k = 0 ; k < isUsed.length; k++){
                isUsed[k] = false;
            }

            for(int k = 0; k < primeNumberList.size(); k++)
            {
                if (isUsed[k] == false)
                {
                    for(int p =0; p < primeNumberList.size(); p++){
                        if(primeNumberList.get(k)+primeNumberList.get(p) == N){
                            isUsed[k] = true;
                            isUsed[p] = true;
                            answerList.add(new Node(primeNumberList.get(k),primeNumberList.get(p)));
                            break;
                        }
                    }
                }
            }

            if(answerList.size() == 1){
                System.out.println(answerList.get(0).primeNum1+" "+answerList.get(0).primeNum2);
            }
            else{
                Node mindiff_node = answerList.get(0);

                for(int k = 1 ; k < answerList.size();k++){
                    if(answerList.get(k).diff < mindiff_node.diff)
                    {
                        mindiff_node = answerList.get(k);
                    }
                }

                System.out.println(mindiff_node.primeNum1+" "+mindiff_node.primeNum2);
            }
        }
    }

    public static ArrayList<Integer> getPrimeNumberList(int number){
        ArrayList<Integer> primeNumberList = new ArrayList<>();

        boolean[] isPrimeArray = new boolean[number+1];
        isPrimeArray[0] = false;
        isPrimeArray[1] = false;

        for(int i = 2; i <= number; i++){
            isPrimeArray[i] = true;
        }

        for(int i = 2; i*i <= number; i++)
        {
            for(int j = i*i; j <= number; j+=i)
            {
                isPrimeArray[j] = false;
            }
        }

        for(int i = 2; i <= number; i++)
        {
            if(isPrimeArray[i] == true)
            {
                primeNumberList.add(i);
            }
        }

        return primeNumberList;
    }
}

class Node{
    public int primeNum1;
    public int primeNum2;
    public int diff;

    public Node(int p1, int p2){
        primeNum1 = p1;
        primeNum2 = p2;
        diff = Math.abs(p1-p2);
    }
}
