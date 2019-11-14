package hw_3.taskdz_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Taskdz_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Vvedite polozhitelnoe chislo ");
        int num = sc.nextInt();
        if (Integer.signum(num) == 1) {
            System.out.println(num);
        } else {
            System.out.print("Vy vveli ne polozhitelnoe chislo");
        }
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));
        int firstSum = 0;
        int secondSum = 0;
        int nach = 0;

        for (int i = 0; i < arr.length/2; i++) {
            if (i < arr.length / 2) {
                firstSum += arr[i];
            }
        }
        if (arr.length % 2 != 0) {
            nach = arr.length/2;
            nach++;
        } else {
            nach = arr.length/2;
        }
        for (int i = nach; i < arr.length; i++) {
            secondSum += arr[i];
        }

        if (firstSum > secondSum && firstSum != secondSum) {
            System.out.println("Pervaya polovina bolshe");
        }
        if ((firstSum < secondSum && firstSum != secondSum)) {
            System.out.println("Vtoraya polovina bolshe");
        }
        if (firstSum == secondSum) {
            System.out.println("Poloviny ravny");
        }

    }
}
