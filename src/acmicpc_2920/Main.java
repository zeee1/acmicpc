package acmicpc_2920;


import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] soundArr = new int[8];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < 8 ; i++){
            soundArr[i] = scanner.nextInt();
        }

        int[] copied_soundArr = new int[8];
        System.arraycopy(soundArr,0,copied_soundArr,0,8);

        Arrays.sort(copied_soundArr);

        boolean isChanged = false;

        for(int i = 0 ; i < 8; i++){
            if(soundArr[i] != copied_soundArr[i]){
                isChanged = true;
            }
        }

        if(isChanged == true){
            isChanged = false;
            int[] newlyArr = new int[8];
            for(int i = 7; i >= 0; i--){
                newlyArr[7-i] = copied_soundArr[i];
            }

            for(int i = 0 ; i < 8; i++){
                if(soundArr[i] != newlyArr[i]){
                    isChanged = true;
                }
            }

            if(isChanged == true){
                System.out.println("mixed");

            }
            else{
                System.out.println("descending");
            }
        }
        else{
            System.out.println("ascending");
        }
    }
}
