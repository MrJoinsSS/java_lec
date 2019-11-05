package hw_3.task_4;

public class Task_4 {
    public static void main(String[] args) {

        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = (i+1)*(j+1);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
