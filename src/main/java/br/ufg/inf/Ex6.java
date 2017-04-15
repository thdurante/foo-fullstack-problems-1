package br.ufg.inf;

public class Ex6 {

    public static void main(String[] args) {
        Double[] array = new Double[50];

        for (int i = 0; i < 50; i++) {
            if (i == 0 || i == 49) {
                array[i] = 100.0;
            } else {
                array[i] = Math.pow(i - 1, 2) + Math.sqrt(i + 1);
            }
            System.out.println(array[i]);
        }
    }
}
