package hw_3.taskdz_8;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_8 {
    public static void main(String[] args) {

        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        double[] thirdArr = new double[10];

        Random random = new Random();
        int counter = 0;


        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = random.nextInt(9);
        }
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = random.nextInt(9);
        }
        for (int i = 0; i < thirdArr.length; i++) {
            if (secondArr[i] != 0) {
                thirdArr[i] = (double) firstArr[i] / (double) secondArr[i];
            } else {
                thirdArr[i] = 0;
            }

            if (thirdArr[i] == (int) thirdArr[i] && thirdArr[i] != 0) {
                counter++;
            }

        }
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        System.out.println(Arrays.toString(thirdArr));
        System.out.println(counter);

    }
}
