package br.ufg.inf;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

    private static final List<Integer> validIncreaseCodes = new ArrayList<>(Arrays.asList(1,2,3,4));
    private static Double initialPrice = null;
    private static Double increasedPrice = null;
    private static Double finalPrice = null;
    private static Integer increaseCode = null;

    public static void main(String[] args) {

        /*
        * User input: price
        * */
        while (initialPrice == null) {
            try {
                initialPrice = Double.parseDouble(JOptionPane.showInputDialog("Product Price (R$):"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not a valid price!");
                e.printStackTrace();
            }

        }

        /*
        * User input: increaseCode
        * */
        while (!validIncreaseCodes.contains(increaseCode)) {
            try {
                increaseCode = Integer.parseInt(JOptionPane.showInputDialog("Increase Code [1..4]:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not a valid increase code!");
                e.printStackTrace();
            }
        }

        /*
        * Calculating the increased price
        * */
        switch (increaseCode) {
            case 1:
                increasedPrice = initialPrice * 1.1;
            case 2:
                increasedPrice = initialPrice * 1.25;
            case 3:
                increasedPrice = initialPrice * 1.3;
            case 4:
                increasedPrice = initialPrice * 1.5;
        }

        /*
        * Calculating the final price
        * */
        if (increasedPrice >= 1000 && increasedPrice <= 5000) {
            finalPrice = increasedPrice * 1.01;
        } else if (increasedPrice >= 5000.01 && increasedPrice <= 10000) {
            finalPrice = increasedPrice * 1.02;
        } else if (increasedPrice >= 10000.01) {
            finalPrice = increasedPrice * 1.03;
        } else {
            finalPrice = increasedPrice;
        }

        JOptionPane.showMessageDialog(null, "The final price of the product (increase rate + tax): R$" + finalPrice);
    }
}
