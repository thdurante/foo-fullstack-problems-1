package br.ufg.inf;

import javax.swing.*;

public class Ex2 {

    private static Integer workedHours = null;
    private static Double hourValue = null;
    private static Integer dependents = null;
    private static Double bruteEarnings = null;
    private static Double inssDiscounts = null;
    private static Double irDiscounts = null;
    private static Double finalEarnings = null;

    private static Object getUserInput(String inputType, String inputMessage, String errorMessage) {
        Object variable = null;

        while (variable == null) {
            try {
                switch (inputType) {
                    case "Double":
                        variable = Double.parseDouble(JOptionPane.showInputDialog(inputMessage));
                        break;
                    case "Integer":
                        variable = Integer.parseInt(JOptionPane.showInputDialog(inputMessage));
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, errorMessage);
                e.printStackTrace();
            }
        }

        return variable;
    }

    public static void main(String[] args) {

        /*
        * User input
        * */

        workedHours = (Integer) getUserInput("Integer", "Worked hours:", "Not a valid input!");
        hourValue = (Double) getUserInput("Double", "Hour value (R$):", "Not a valid input!");
        dependents = (Integer) getUserInput("Integer", "Dependents:", "Not a valid input!");

        /*
        * Calculations
        * */

        bruteEarnings = workedHours * hourValue + (50 * dependents);
        inssDiscounts = bruteEarnings <= 1000 ? bruteEarnings * (8.5/100) : bruteEarnings * 0.09;

        if (bruteEarnings <= 500) {
            irDiscounts = 0.0;
        } else if (bruteEarnings > 500 && bruteEarnings <= 1000) {
            irDiscounts = bruteEarnings * 0.05;
        } else if (bruteEarnings > 1000) {
            irDiscounts = bruteEarnings * 0.07;
        }

        finalEarnings = bruteEarnings - inssDiscounts - irDiscounts;

        /*
        * Results
        * */

        JOptionPane.showMessageDialog(
                null,
                "Brute Earnings (R$): " + String.format("%.2f", bruteEarnings) +
                         "\nINSS Discounts (R$): " + String.format("%.2f", inssDiscounts) +
                         "\nIR Discounts (R$): " + String.format("%.2f", irDiscounts) +
                         "\nFinal Earnings (R$): " + String.format("%.2f", finalEarnings)
        );
    }
}
