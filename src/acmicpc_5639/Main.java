package acmicpc_5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Node tree = null;
        String input;

        while((input = bf.readLine())!=null && input.length() !=0){
            tree = insertNode(tree, Integer.parseInt(input));
        }
        printPostOrder(tree);
    }

    public static void printPostOrder(Node node){
        if(node == null){
            return ;
        }
        else{
            printPostOrder(node.leftChild);
            printPostOrder(node.rightChild);
            System.out.println(node.value);
        }
    }

    public static Node insertNode(Node node, int number){
        if(node == null){
            return new Node(number, null, null);
        }
        else{
            if(node.value < number){
                node.rightChild = insertNode(node.rightChild, number);
            }
            else{
                node.leftChild = insertNode(node.leftChild, number);
            }
        }
        return node;
    }
}

class Node{
    public int value;
    public Node leftChild;
    public Node rightChild;

    public Node(int value, Node leftChild, Node rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
