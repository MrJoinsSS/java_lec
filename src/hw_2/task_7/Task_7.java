package hw_2.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {

        int n = 9;
        int space = 16;
        int inc = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i > 1) System.out.print(i);
            for (int j = 0; j < space; j++) {

                    System.out.print(" ");

            }
            if (i > 1) System.out.print(i);
            System.out.println(i);
            space--;
        }

    }
}
