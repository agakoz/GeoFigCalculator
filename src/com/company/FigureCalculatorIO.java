package com.company;
import java.util.Scanner;
public class FigureCalculatorIO {
    Scanner read = new Scanner(System.in);
    public int chooseFigure(){
        System.out.print("1. Square\n2. Circle\n3. Exit\n>> ");
        return read.nextInt();
    }

    public void printInfo(double area, double circum){
        System.out.print("\nArea: "+ area);
        System.out.print("\nCircumference: " + circum);

    }
    public void setFigParameters(Figure figure){
        if( figure instanceof Square){
            System.out.print("Side: ");
            ((Square)figure).setSide(read.nextDouble());
        }
        if (figure instanceof Circle){
            System.out.print("Radius: ");
            ((Circle)figure).setRadius(read.nextDouble());
        }
    }
}
