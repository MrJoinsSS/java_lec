package hw.task_7;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        int kol = sc.nextInt();
        String kon = "программист";
        String a = "а";
        String ov = "ов";


        if (kol == 1 || kol == 21 || kol == 31 || kol == 41) {
            System.out.println(kol + " " + kon);
        }
        if (kol > 1 && kol < 5 || kol > 21 && kol < 25 || kol > 31 && kol < 35 || kol > 41 && kol < 45) {
            System.out.println(kol + " " + kon + a);
        }
        if (kol > 4 && kol < 21 || kol > 24 && kol < 31 || kol > 34 && kol < 41 || kol > 44 && kol < 51) {
            System.out.println(kol + " " + kon + ov);
        }

    }
}
