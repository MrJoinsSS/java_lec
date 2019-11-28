package hw_3.taskdz_11;

import java.util.ArrayList;
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
        System.out.println("Sum " + sumOfEvenMainDiagonal);
// task 2
        ArrayList<Integer> unevenElementsUnderTheMainDiagonal = new ArrayList<Integer>();
        for (int i = 1; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < i; j++) {
                if (squareMatrix[i][j] % 2 != 0) {
                    unevenElementsUnderTheMainDiagonal.add(squareMatrix[i][j]);
                }
            }
        }
        System.out.println("Uneven elements under the main diagonal " + unevenElementsUnderTheMainDiagonal);
// task 3
        int multiplyOfMainDiagonal = 1;
        int multiplyOfSideDiagonal = 1;
        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < sizeSquareMatrix; j++) {
                if (i == j) {
                    multiplyOfMainDiagonal *= squareMatrix[i][j];
                }
            }
        }

        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = sizeSquareMatrix - 1 - i; j >= 0; j--) {
                multiplyOfSideDiagonal *= squareMatrix[i][j];
                break;
            }
        }
        if (multiplyOfMainDiagonal > multiplyOfSideDiagonal) {
            System.out.println("Multiply of the main diagonal matrix > multiply of the side diagonal matrix " + "( " +
                    multiplyOfMainDiagonal + " > " + multiplyOfSideDiagonal + " )");
        }
        if (multiplyOfMainDiagonal < multiplyOfSideDiagonal) {
            System.out.println("Multiply of the main diagonal matrix < multiply of the side diagonal matrix " + "( " +
                    multiplyOfMainDiagonal + " < " + multiplyOfSideDiagonal + " )");
        }
// task 4
        int sumEvenElementsAboveTheSideDiagonal = 0;

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < sizeSquareMatrix - 1 - i; j++) {
                if (squareMatrix[i][j] % 2 == 0){
                    sumEvenElementsAboveTheSideDiagonal += squareMatrix[i][j];
                }
            }
        }
        System.out.println("Sum even elements above the side diagonal " + sumEvenElementsAboveTheSideDiagonal);
        /* не понятно задание*/
// task 5
        int[][] transformSquareMatrix = new int[sizeSquareMatrix][sizeSquareMatrix];
        for (int i = 0; i < sizeSquareMatrix; i++) {
            for (int j = 0; j < sizeSquareMatrix; j++) {
                transformSquareMatrix[i][j] = squareMatrix[j][i];
                System.out.print(transformSquareMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
