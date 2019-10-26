package com.ifmo.lesson2;

public class NonNegativeSequence {
    /*
    Создайте программу, выводящую на экран все неотрицательные элементы
    последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int param = 90;
        while (param >=0){
            System.out.println(param);
            param -=5;

        }
    }
}
