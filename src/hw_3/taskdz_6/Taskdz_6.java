package hw_3.taskdz_6;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_6 {
    public static void main(String[] args) {

        int[] arr = new int[4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int prev = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > prev) {
                prev = arr[i];
                counter++;
            }

        }
        if (counter == arr.length){
            System.out.println("Massiv strogo vozrastaushei progressii");
        } else System.out.println("Massiv ne strogo vozrastaushei progressii");

    }
}
