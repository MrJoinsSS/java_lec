package hw.task_1;

public class Task_1 {
    public static void main(String[] args) {


        int number = 324;

        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
            number = number * (-1);
        }

        if (number >= 0 && number < 10) {
            System.out.println("Single digit");
        } else if (number > 10 && number < 100) {
            System.out.println("Double digit");
        } else if (number > 100 && number < 1000) {
            System.out.println("Three-digit number");
        }
    }
}
