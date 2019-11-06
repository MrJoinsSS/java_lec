package hw_3.task_5;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] arrCopy = new int[arr.length];
        int indexArr = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            arrCopy[indexArr] = arr[i];
            indexArr--;
        }
        System.out.print(Arrays.toString(arrCopy));
    }
}
