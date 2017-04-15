package br.ufg.inf;

import java.util.Scanner;

public class Ex10 {

    private static int[][] readMatrixInput(int rows, int columns, String matrixId) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element (" + (i + 1) + ", " + (j + 1) + ") of the " + rows + "x" + columns + " " + matrixId + ":");
                matrix[i][j] = scan.nextInt();
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            System.out.print("  |  ");
            for (int j = 0; j < columns; j++) {
                System.out.print(String.format("%02d", matrix[i][j]) + "  ");
            }
            System.out.print("|\n");
        }
    }

    private static void highestNumber(int[][] matrix) {
        Integer biggestElement = Integer.MIN_VALUE;
        Integer biggestElementRow = null;
        Integer biggestElementColumn = null;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > biggestElement) {
                    biggestElement = matrix[i][j];
                    biggestElementRow = i + 1;
                    biggestElementColumn = j + 1;
                }
            }
        }


        System.out.println("The biggest element and its position is " + biggestElement + " at (" + biggestElementRow + ", " + biggestElementColumn + ")");
    }

    public static void main(String[] args) {
        int[][] matrix;

        /*
        * User Input
        * */
        matrix = readMatrixInput(5, 7, "matrix");

        /*
        * Results
        * */
        System.out.println("\n\n");
        System.out.println("The matrix is:");
        printMatrix(matrix);

        System.out.println("\n");
        highestNumber(matrix);
    }
}
