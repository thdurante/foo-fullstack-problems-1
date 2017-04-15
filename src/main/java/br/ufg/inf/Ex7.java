package br.ufg.inf;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter the element #" + (i + 1) + " of the integer array:");
            array[i] = scan.nextInt();
        }

        System.out.println("\n\nThe odd numbers in the integer array are:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Number " + array[i] + " Position: " + i);
            }
        }
    }
}
