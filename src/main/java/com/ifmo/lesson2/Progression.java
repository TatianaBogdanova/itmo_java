package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int p =1000; String.valueOf(p).length() < 5; p+=3){
            System.out.print(p + " ");
        }
    }
}
