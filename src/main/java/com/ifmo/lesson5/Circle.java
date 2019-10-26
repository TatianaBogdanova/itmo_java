package main.java.com.ifmo.lesson5;

public class Circle  extends Oval {
    private  double r;

    public Circle(double r) {
        this.r =r;
    }

    public double area(double r){
        return 2.0*r*Math.PI;
    }
}
