package hw_3.taskdz_5;

import java.util.Arrays;
import java.util.Random;

public class Taskdz_5 {
    public static void main(String[] args) {

        int[] firstArr = new int[5];
        int[] secondArr = new int[5];
        float firstSum = 0;
        float secondSum = 0;


        Random rand = new Random();
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(firstArr));
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(secondArr));
        for (int i = 0; i < firstArr.length; i++) {
            firstSum += firstArr[i];
        }
        float firstSrednee= firstSum / firstArr.length;


        for (int i = 0; i < secondArr.length; i++) {
            secondSum += secondArr[i];
        }
        float secondSrednee= secondSum / secondArr.length;


        if (firstSum >secondSum && firstSum != secondSum){
            System.out.println( firstSrednee + " > " + secondSrednee);
        } else {
            System.out.println(firstSrednee + " < " + secondSrednee);
        }
        if (firstSrednee == secondSrednee){
            System.out.println(firstSrednee + " = " + secondSrednee);
        }
    }
}