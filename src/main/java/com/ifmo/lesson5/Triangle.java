package main.java.com.ifmo.lesson5;

public class Triangle extends Shape{

    private  double a1;
    private double a2;
    private double a3;

    public Triangle(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double area(){
        double p = (a1+a2+a3)/2.0;
        return Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
    }
}
