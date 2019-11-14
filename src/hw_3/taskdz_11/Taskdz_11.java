package hw_3.taskdz_11;

import java.util.Random;
import java.util.Scanner;

public class Taskdz_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input size of square matrix: ");
        int sizeSquareMatrix = sc.nextInt();
        int[][] squareMatrix = new int[sizeSquareMatrix][sizeSquareMatrix];
        Random randomForMatrix = new Random();
        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < sizeSquareMatrix; j++) {
                squareMatrix[i][j] = randomForMatrix.nextInt(50);
            }
        }

        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < sizeSquareMatrix; j++) {
                System.out.print(squareMatrix[i][j] + "\t");
            }
            System.out.println();
        }
// task 1
        int sumOfEvenMainDiagonal = 0;
        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < sizeSquareMatrix; j++) {
                if (squareMatrix[i][j] % 2 == 0 && i == j) {
                    sumOfEvenMainDiagonal += squareMatrix[i][j];
                }
            }
        }
        System.out.println(sumOfEvenMainDiagonal);
// task 2


    }
}
