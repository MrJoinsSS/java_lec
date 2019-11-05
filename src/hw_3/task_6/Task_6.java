package hw_3.task_6;

import java.util.Arrays;


public class Task_6 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 63, 645, 34, 87, 876, 43, 2, 6, 8, 976, 34, 32, 37, 22, 95};

        int countChet = 0;
        int counter =0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countChet++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arrChet = new int[countChet];
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                        arrChet[counter] = arr[i];
                        counter++;
                    }
                }

        System.out.println(Arrays.toString(arrChet));

    }
}
