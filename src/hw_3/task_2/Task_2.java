package hw_3.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int [] arr = {34, 77, 23, 87, 40};
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average/arr.length;
        System.out.println("Srednee arifmeticheskoe: " + average);
    }
}
