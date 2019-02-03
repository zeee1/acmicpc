package acmicpc_2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] numberArr = new int[number];
        int sum = 0;

        for(int i = 0; i < number; i++){
            numberArr[i] = scanner.nextInt();
            sum += numberArr[i];
        }
        double averageNum = (double)sum/(double)number;
        System.out.println(Math.round(averageNum));

        Arrays.sort(numberArr);
        int median_index = Math.round(number/2);
        System.out.println(numberArr[median_index]);

        ArrayList<Node> nodeList= new ArrayList<>();
        boolean existInNodeList = false;

        for(int i = 0 ; i < number; i++){
            if(i == 0){
                nodeList.add(new Node(numberArr[0], 1));
                continue;
            }
            else{
                for(int j = 0 ; j < nodeList.size(); j++){
                    if(nodeList.get(j).number == numberArr[i]){
                        nodeList.get(j).count += 1;
                        existInNodeList = true;
                        break;
                    }
                }
                if(existInNodeList == false){
                    nodeList.add(new Node(numberArr[i], 1));
                }
                existInNodeList = false;
            }
        }

        int maxCount = nodeList.get(0).count;
        ArrayList<Node> maxNodeList = new ArrayList<>();

        for(int i = 1 ; i < nodeList.size(); i++){
            if (nodeList.get(i).count > maxCount){
                maxCount = nodeList.get(i).count;
            }
        }

        for(int i = 0; i < nodeList.size(); i++){
            if(nodeList.get(i).count == maxCount){
                Node maxCountNode = new Node(nodeList.get(i).number, nodeList.get(i).count);
                maxNodeList.add(maxCountNode);
            }
        }

        if(maxNodeList.size() > 1){
            System.out.println(maxNodeList.get(1).number);
        }
        else{
            System.out.println(maxNodeList.get(0).number);
        }

        int minValue = numberArr[0];
        int maxValue = numberArr[number-1];
        System.out.println(maxValue-minValue);
    }

}

class Node{
    public int number;
    public int count;

    public Node(int n, int c){
        number = n;
        count = c;
    }
}