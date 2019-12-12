package acmicpc_5052;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int testcaseNumber = scanner.nextInt();

        for(int i = 0 ; i < testcaseNumber; i++){
            boolean answer = true;

            Trie searchingTree = new Trie();

            int phoneNumber_count = scanner.nextInt();
            String[] phoneNumberArray = new String[phoneNumber_count];

            for(int j = 0 ; j < phoneNumber_count; j++){
                phoneNumberArray[j] = scanner.next();
            }

            Arrays.sort(phoneNumberArray);

            for(int j = 0 ; j < phoneNumber_count; j++){
                answer = searchingTree.insert(phoneNumberArray[j]);

                if(answer == false){
                    break;
                }
            }

            if(answer){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

class Trie{
    Node root;

    public Trie(){
        this.root = new Node();
    }

    public boolean insert(String word){
        boolean answer = true;
        Node currentNode = root;

        for(int i =0 ; i < word.length(); i++){
            if(currentNode.isLast == true){
                return false;
            }

            String letter = word.substring(i, i+1);

            if(!currentNode.children.containsKey(letter)){
                currentNode.children.put(letter, new Node());
            }
            currentNode = currentNode.children.get(letter);

            if(i == word.length()-1){
                currentNode.isLast = true;
            }
        }
        return answer;
    }
}

class Node{
    public Map<String, Node> children;
    public boolean isLast;

    public Node(){
        this.children = new HashMap<String, Node>();
        this.isLast = false;
    }

}
