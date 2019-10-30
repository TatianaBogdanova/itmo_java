package com.ifmo.lesson2;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 5, b = 11, c = 99;

        String ordering = ordering(a, b, c);

        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        Integer first = null;
        Integer second = null;
        Integer therd = null;

        if ((a> b) && ( a> c)){
            first = a;
            if (b > c){
                second = b;
                therd = c;
            }
            else{
                second = c;
                therd = b;
            }
        }
        else if ((b> a) && ( b> c)){
            first = b;
            if (a > c){
                second = a;
                therd = c;
            }
            else{
                second = c;
                therd = a;
            }
        } else
        if ((c> b) && ( c> a)){
            first = c;
            if (b > a){
                second = b;
                therd = a;
            }
            else{
                second = a;
                therd = b;
            }
        }

        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
                "Возрастающая последовательность: " +  therd+ ", " + second + ", " + first;
    }
}
