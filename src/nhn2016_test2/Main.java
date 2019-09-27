package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        String[] words = null;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line = br.readLine();
            words = line.split(" ");
        }catch (IOException e){
            e.printStackTrace();
        }

        int totalNumOfM = 0;
        int totalNumOfJ = 0;
        int tempNumOfM = 0;
        int tempNumOfJ = 0;

        for(String word: words){
            tempNumOfJ = 0;
            tempNumOfM = 0;

            for (int i = 0 ; i < word.length(); i++){
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e'|| word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) =='u'){
                    tempNumOfM += 1;
                    tempNumOfJ = 0;
                }else{
                    tempNumOfJ += 1;
                    tempNumOfM = 0;
                }

                if (tempNumOfM == 2){
                    totalNumOfM += 1;
                    break;
                }
                else if(tempNumOfJ == 3){
                    totalNumOfJ += 1;
                    break;
                }
            }
        }

        System.out.println(totalNumOfM);
        System.out.println(totalNumOfJ);
    }
}
