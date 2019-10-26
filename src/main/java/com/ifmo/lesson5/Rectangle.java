package com.ifmo.lesson5;

import java.rmi.MarshalException;

public class Rectangle extends  Shape {
    private double a1;
    private double a2;

    public Rectangle(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Rectangle() {
    }

    public double area(){
        return a1*a2;
    }
}
