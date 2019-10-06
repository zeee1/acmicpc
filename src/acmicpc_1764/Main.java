package acmicpc_1764;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        String[] nameList = new String[N];
        Hashtable hashtable = new Hashtable();
        int count = 0;

        for(int i = 0 ; i < N ; i++){
            hashtable.put(scanner.next(),true);
        }

        for(int i = 0; i < M ; i++){
            String name = scanner.next();

            if(hashtable.containsKey(name)){
                nameList[count] = name;
                count += 1;
            }
        }

        System.out.println(count);
        String[] result = new String[count];
        System.arraycopy(nameList, 0, result, 0, count);
        Arrays.sort(result);
        for(int i = 0 ; i < count; i++){
            System.out.println(result[i]);
        }
    }
}
