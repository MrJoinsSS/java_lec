package hw.task_3;


import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int in = sc.nextInt();

        if (in > 0){
            in++;
            System.out.println(in);

        } else if(in < 0){
            in = in-2;
            System.out.println(in);

        } else if(in == 0){
            in = 10;
            System.out.println(in);
        }

    }
}
