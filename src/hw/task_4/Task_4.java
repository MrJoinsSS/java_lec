package hw.task_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        int a = sc.nextInt();
        System.out.println("Vvedite 2-oe chislo");
        int b = sc.nextInt();
        System.out.println("Vvedite 3-e chislo");
        int c = sc.nextInt();
        int sum = 0;


//        if (a > 0){
//            if (b > 0){
//                if (c > 0){
//                    System.out.println(a+b+c);
//                } else System.out.println(a+b);
//            } else if(c > 0){
//                System.out.println(a+c);
//            }
//            System.out.println(a);
//        } else if (b > 0){
//
//        } else System.out.println("Net polozhitelnyh");

//        if (a > 0 && b > 0 && c > 0){
//            System.out.println(a+b+c);
//        } else if (a < 0 && b > 0 && c > 0){
//            System.out.println(b+c);
//        } else if (a > 0 && b < 0 && c > 0){
//            System.out.println(a+c);
//        } else if (a > 0 && b > 0 && c < 0){
//            System.out.println(a+b);
//        } else if (a < 0 && b > 0 && c > 0){
//            System.out.println(b+c);
//        } else if (a < 0 && b < 0 && c < 0){
//            System.out.println("Net polozhitelnyh");
//        }

        if (a > 0){
            sum = a;
        } else if (b > 0){
            sum = b;
        } else if (c > 0){
            sum = c;
        }



    }
}
