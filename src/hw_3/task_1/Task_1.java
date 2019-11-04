package hw_3.task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        int[] arr = new int[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
