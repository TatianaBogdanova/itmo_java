package com.ifmo.lesson9;

public interface Appendable<T> {

    Appendable append (T temp);

    T value();
}
