package br.ufg.inf;

public class Ex5 {

    public Double territorialTax(Double totalArea, Double constructedArea) {
        return (5 * constructedArea) + ((totalArea - constructedArea) * 3.8);
    }
}
