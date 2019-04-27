package com.company;

public class Main {

    public static void main(String[] args) {
        FigureCalculator calculator = new FigureCalculator();
        calculator.calculate(new FigureFactory(), new FigureCalculatorIO());
    }
}
