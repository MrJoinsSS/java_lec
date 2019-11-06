package hw_2.task_4;

public class Task_4 {
    public static void main(String[] args) {

        int counter = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(".");
            }
            counter--;
            System.out.println();
        }

    }
}
