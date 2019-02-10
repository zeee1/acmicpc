package acmicpc_1181;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        HashSet wordSet = new HashSet();

        for (int i = 0; i < wordCount; i++) {
            String word = scanner.next();
            wordSet.add(word);
        }



        ArrayList<String> wordList = new ArrayList<>(wordSet);
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String input1, String input2) {
                if(input1.length() > input2.length()){
                    return 1;
                }
                else if(input1.length() < input2.length()){
                    return -1;
                }
                else{
                    return input1.compareTo(input2);
                }
            }
        });

        for(int i = 0 ; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }
    }

}

