package com.ifmo.lesson6;

public class Plus<Integer> implements Operation<java.lang.Integer>{


    @Override
    public java.lang.Integer calculate(java.lang.Integer a, java.lang.Integer b) {
        return a+b;
    }
}
