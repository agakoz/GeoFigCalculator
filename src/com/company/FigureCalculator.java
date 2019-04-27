package com.company;

public class FigureCalculator {
    void calculate (FigureFactory factory, FigureCalculatorIO io) {
        Figure figure;
        figure = factory.createFigure(io.chooseFigure());
        if(figure != null){
            io.setFigParameters(figure);
            io.printInfo(figure.calculateArea(), figure.calculateCircum());
        }

    }
}
