package com.ifmo.lesson5;

public class Square  extends Rectangle{
    private double a1;

    public Square(double a1) {
        this.a1 = a1;
    }

    public double area(double a1){
        return  a1*a1;
    }
}
