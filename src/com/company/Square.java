package com.company;

public class Square extends Figure{
    private double side;

    public Square(int side){
        this.side = side;
    }
    public Square(){
        this(0);
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double calculateArea(){
        return side * side;
    }

    public double calculateCircum(){
        return 4*side;
    }
}
