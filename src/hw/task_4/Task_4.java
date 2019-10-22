package hw.task_4;

import java.util.Scanner;

public class Task_4 {   // а kotlin лучше чем java
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        int a = sc.nextInt();
        System.out.println("Vvedite 2-oe chislo");
        int b = sc.nextInt();
        System.out.println("Vvedite 3-e chislo");
        int c = sc.nextInt();
        int sum = 0;


        if (a > 0){
            sum += a;
        }
        if (b > 0){
            sum += b;
        }
        if (c > 0){
            sum += c;
        }

        System.out.println(sum);

    }
}
