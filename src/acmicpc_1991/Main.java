package acmicpc_1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Node tree = null;

        int N = scanner.nextInt();

        for(int i = 0 ; i < N ; i++){
            String input1 = scanner.next();
            String input2 = scanner.next();
            String input3 = scanner.next();

            tree = insertNode(tree, input1, input2, input3);
        }

        printPreorder(tree);
        System.out.println();
        printInorder(tree);
        System.out.println();
        printPostorder(tree);
        System.out.println();
    }

    public static void printPreorder(Node root){
        if(root == null || root.value.equals(".")){
            return;
        }
        else{
            System.out.print(root.value);
            printPreorder(root.leftChild);
            printPreorder(root.rightChild);
        }

    }
    public static void printInorder(Node root){
        if(root == null || root.value.equals(".")){
            return ;
        }
        else{
            printInorder(root.leftChild);
            System.out.print(root.value);
            printInorder(root.rightChild);
        }
    }
    public static void printPostorder(Node root){
        if(root == null || root.value.equals(".")){
            return ;
        }
        else{
            printPostorder(root.leftChild);
            printPostorder(root.rightChild);
            System.out.print(root.value);
        }
    }

    public static Node insertNode(Node node, String input1, String input2, String input3){
        if(node == null){
            return new Node(input1, new Node(input2, null, null), new Node(input3, null, null));
        }
        else if (node.value.equals(input1)){
            node.leftChild = new Node(input2, null, null);
            node.rightChild = new Node(input3, null, null);
            return node;
        }
        else{
            if(node.leftChild != null){
                node.leftChild = insertNode(node.leftChild, input1, input2, input3);
            }

            if(node.rightChild != null){
                node.rightChild = insertNode(node.rightChild, input1, input2, input3);
            }
        }
        return node;
    }
}

class Node{
    public String value;
    public Node leftChild;
    public Node rightChild;

    public Node(String value, Node leftChild, Node rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
