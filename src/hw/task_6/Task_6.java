package hw.task_6;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        int a = sc.nextInt();
        System.out.println("Vvedite 2-oe chislo");
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a);
        } else System.out.println(b);
    }
}
