package hw_2.task_7;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {


        Jope[] jopes = new Jope[17];
        Arrays.fill(jopes, new Jope());
        int counter = 0;
        int num = 1;


        for (int i = 0; i < jopes[i].getPipidron().length; i++) {
            for (int j = counter; j < jopes.length - counter; j++) {
                jopes[i].getPipidron()[j] = Character.forDigit(num, 10);
            }
            counter++;
            num++;
            if (num > 9) break;

        }

        for (int i = 0; i < jopes.length; i++) {
            for (int j = 0; j < jopes[i].getPipidron().length; j++) {
                System.out.print(Character.toString(jopes[i].getPipidron()[j]));
            }
            System.out.println();
        }
    }

}


