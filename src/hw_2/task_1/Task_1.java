package hw_2.task_1;

public class Task_1 {
    public static void main(String[] args) {

        int sumPoz = 0;
        int sumNeg = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumPoz += i;
            } else sumNeg += i;
        }

        System.out.println("Summa polozhitelnyh = " + sumPoz);
        System.out.println("Summa otricatelnyh = " + sumNeg);
        System.out.println("Total = " + (sumPoz+sumNeg));

    }
}
