package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for ( int count = 0; count < 20; count++) System.out.println( (int) Math.pow(2, (count + 1)));
    }
}
