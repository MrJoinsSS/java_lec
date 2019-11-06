package hw_3.taskdz_1;

public class Taskdz_1 {
    public static void main(String[] args) {
        int counter = 0;
        int incArr = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        int[] arr = new int[counter];

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[incArr] = i;
                incArr++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
