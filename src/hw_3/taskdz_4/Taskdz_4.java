package hw_3.taskdz_4;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_4 {
    public static void main(String[] args) {

        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i%2 != 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
