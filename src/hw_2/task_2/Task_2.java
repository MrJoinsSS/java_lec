package hw_2.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        int[] num = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Naibolshee chislo: " + max);
        System.out.println("Naimenshee chislo: " + min);
    }

}
