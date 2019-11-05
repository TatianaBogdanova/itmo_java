package com.ifmo.lesson6;

public interface Operation<T extends Number> {
    T calculate( T a, T b);
}
