package com.company;

public class Circle extends Figure{
    double radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public Circle(){
        this(0);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return radius*radius*Math.PI;
    }
    public double calculateCircum(){
        return 2*Math.PI*radius;
    }

}
