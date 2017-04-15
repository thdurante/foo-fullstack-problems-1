package br.ufg.inf;

import java.util.Scanner;

public class Ex9 {

    private static int[][] readMatrixInput() {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the element (" + (i + 1) + ", " + (j + 1) + ") of the " + 2 + "x" + 2 + " " + 2 + ":");
                matrix[i][j] = scan.nextInt();
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultingMatrix = new int[2][2];

        matrix1 = readMatrixInput();
        matrix2 = readMatrixInput();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultingMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(" | " + resultingMatrix[i][0] + "  " + resultingMatrix[i][1] + " | ");
        }
    }
}
