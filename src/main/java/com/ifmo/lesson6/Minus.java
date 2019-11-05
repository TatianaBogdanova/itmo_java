package com.ifmo.lesson6;

public class Minus<Double> implements Operation<java.lang.Double> {

    @Override
    public java.lang.Double calculate(java.lang.Double a, java.lang.Double b) {
        return a-b;
    }
}
