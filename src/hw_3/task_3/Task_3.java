package hw_3.task_3;

public class Task_3 {
    public static void main(String[] args) {

        int[] arr = {34, 77, 23, 87, 40};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
}
