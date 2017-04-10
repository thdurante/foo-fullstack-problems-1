package br.ufg.inf;

public class Ex3 {

    public Double operation(Double n1, Double n2, String operator) {
        switch (operator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n2 != 0.0 ? n1 / n2 : null;
        }
        return null;
    }
}
