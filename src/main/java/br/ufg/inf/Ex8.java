package br.ufg.inf;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        int[][] matrix = new int[3][3];

        /*
        * User input
        * */
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter the element #" + (i + 1) + " of the integer array:");
            array[i] = scan.nextInt();
        }

        /*
        * Array to matrix conversion
        * */
        int arrayIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = array[arrayIndex++];
            }
        }

        /*
        * Printing results
        * */
        System.out.println("\n\nThe integer array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\n\nThe resulting matrix is:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" | " + matrix[i][0] + "  " + matrix[i][1] + "  " + matrix[i][2] + " | ");
        }
    }
}
