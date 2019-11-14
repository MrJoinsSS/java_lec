package hw_3.taskdz_7;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_7 {
    public static void main(String[] args) {

        int[] arr = new int[12];
        int max = arr[0];
        int lol = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max){
                max = arr[i];
                lol = i;
            }
        }
        System.out.println(lol);
    }
}
