package hw.task_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        int a = sc.nextInt();
        System.out.println("Vvedite 2-oe chislo");
        int b = sc.nextInt();
        System.out.println("Vvedite 3-e chislo");
        int c = sc.nextInt();
        int poz = 0;
        int neg = 0;


        if (a > 0) {
            poz++;
        } else neg++;
        if (b > 0) {
            poz++;
        } else neg++;
        if (c > 0) {
            poz++;
        } else neg++;

        System.out.println("Pozitive: " + poz);
        System.out.println("Negative: " + neg);

    }
}
