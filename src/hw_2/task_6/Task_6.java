package hw_2.task_6;

public class Task_6 {
    public static void main(String[] args) {

        int n = 13;
        int proiz = 1;

        for (int i = 5; i <= n; i++) {
            proiz *= i;
        }

        System.out.println("n: " + n);
        System.out.println("Proisvedenie: " + proiz);
    }

}
