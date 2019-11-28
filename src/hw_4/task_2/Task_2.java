package hw_4.task_2;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Intput rows for matrix A and B ");
        int rows = sc.nextInt();
        System.out.print("Intput columns for matrix A ");
        int columns = sc.nextInt();
        System.out.println();

        int[][] matrixA = new int[rows][columns];
        int[] matrixB = new int[rows];
        int[] matrixC = new int[rows];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixA[i][j] = random.nextInt(99);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.print("\t");
            matrixB[i] = random.nextInt(99);
            System.out.print(matrixB[i] + "\t");
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i] += matrixA[i][j]*matrixB[i];
                //System.out.print(matrixC[i] +"\t");
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println(matrixC[i]);
        }

    }
}
