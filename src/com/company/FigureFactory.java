package com.company;

public class FigureFactory {
    Figure createFigure (int whichFigute){
        switch (whichFigute){
            case 1: return new Square();
            case 2: return new Circle();
            default: return null;
        }
    }
}
