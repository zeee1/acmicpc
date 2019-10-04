package acmicpc_10798;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();

        for(int i = 0 ; i < 5; i++){
            String inputStr = scanner.nextLine();

            for(int j = 0 ; j < inputStr.length(); j++){
                if(hashMap.containsKey(j)){
                    String storedStr = hashMap.get(j);
                    storedStr += inputStr.substring(j, j+1);
                    hashMap.put(j, storedStr);
                }else{
                    hashMap.put(j, inputStr.substring(j, j+1));
                }
            }
        }

        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        String answer = "";

        while (itr.hasNext())

        {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>)itr.next();
            answer += e.getValue();
        }

        System.out.println(answer);

    }
}
