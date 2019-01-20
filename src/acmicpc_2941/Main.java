package acmicpc_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.next();

        String[] croatia_alphabet_list = {"c=", "c-", "dz=", "d-","lj", "nj", "s=", "z="};

        for(int i = 0; i < croatia_alphabet_list.length; i++ ){
            if(strInput.contains(croatia_alphabet_list[i])){
                strInput = strInput.replaceAll(croatia_alphabet_list[i], "A");
            }
        }

        System.out.println(strInput.length());
    }
}
