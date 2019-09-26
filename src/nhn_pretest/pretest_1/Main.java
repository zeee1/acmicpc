package pretest_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int movecount = scanner.nextInt();
        boolean direction;

        if (movecount <= 0){
            direction = false;
        }
        else{
            direction = true;
        }
        movecount = Math.abs(movecount);

        String[][] nameArray = new String[N][N];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0; j < N; j++){
                nameArray[i][j] = scanner.next();
            }
        }

        String[][] changedNameArray = new String[N][N];

        int count = 0;


        while(count <= N/2){
            ArrayList<String> components = new ArrayList<>();

            for (int i = count; i < N-count; i++){
                components.add(nameArray[count][i]);
            }

            for(int i = count+1; i < N-count; i++){
                components.add(nameArray[i][N-count-1]);
            }

            for(int i = N-count-2; i >= count; i--){
                components.add(nameArray[N-count-1][i]);
            }

            for(int i = N-count-2; i > count; i--){
                components.add(nameArray[i][count]);
            }

            int componentsSize = components.size();
            if(components.size() == 0){
                break;
            }

            if(components.size() == 1){
                changedNameArray[count][count] = components.get(0);
                break;
            }
            int modularCount = movecount%componentsSize;

            if (direction == false){
                for(int i = 0 ; i < modularCount ; i++){
                    String poppedComponents = components.remove(0);
                    components.add(poppedComponents);
                }

                direction = true;
            }
            else{
                for(int i = 0 ; i < modularCount ; i++){
                    String poppedComponents = components.remove(components.size()-1);
                    components.add(0, poppedComponents);
                }
                direction = false;
            }

            for (int i = count; i < N-count; i++){
                changedNameArray[count][i] = components.remove(0);
            }

            for (int i = count+1; i < N-count; i++){
                changedNameArray[i][N-count-1] = components.remove(0);
            }

            for (int i = count+1; i < N - count; i++){
                changedNameArray[N-1-count][N-1-i] = components.remove(0);
            }

            for (int i = count+1; i < N-1-count ; i++){
                changedNameArray[N-1-i][count] = components.remove(0);
            }

            count += 1;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < N; j++){
                System.out.print(changedNameArray[i][j]+" ");
            }

            System.out.println();
        }
    }
}
