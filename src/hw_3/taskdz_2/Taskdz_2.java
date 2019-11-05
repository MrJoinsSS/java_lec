package hw_3.taskdz_2;

import java.util.Arrays;

public class Taskdz_2 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 99; i++) {
            if (i%2 != 0){
                counter++;
            }
        }
        int incArr = 0;
        int[] arr = new int[counter];
        for (int i = 1; i <= 99; i++) {
            if (i%2 != 0){
                arr[incArr] = i;
                incArr++;
            }
        }
        System.out.println(Arrays.toString(arr));

        int indexArr = arr.length-1;
        int[] arrInvert = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInvert[indexArr] = arr[i];
            indexArr--;
        }

        System.out.println(Arrays.toString(arrInvert));
    }
}
