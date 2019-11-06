package hw_3.taskdz_3;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int min = 1;
        int max = 99;
        int diff = max - min;

        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(diff + 1);
            arr[i] += min;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Count of chet: " + counter);
    }
}
