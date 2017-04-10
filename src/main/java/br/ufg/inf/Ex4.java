package br.ufg.inf;

public class Ex4 {

    public Double imc(Double height, Double weight) {
        return weight != 0 ? weight / Math.pow(height, 2) : null;
    }
}
