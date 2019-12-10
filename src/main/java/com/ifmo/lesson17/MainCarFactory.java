package com.ifmo.lesson17;

public class MainCarFactory {
    public static void main(String[] args){
        Factory factory = Factory.getFactory("USA");
        Car car = factory.createCar();

        System.out.println(car instanceof Bmw);
    }
}
