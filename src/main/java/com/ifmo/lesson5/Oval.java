package main.java.com.ifmo.lesson5;

public class Oval extends Shape{
    private double a1;
    private double a2;

    public Oval(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Oval() {
    }

    public double area(){
        return a1*a2*Math.PI;
    }
}
