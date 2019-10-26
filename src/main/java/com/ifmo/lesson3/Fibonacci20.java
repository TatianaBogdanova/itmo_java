package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        // TODO implement
        for (int temp: fibonacciNumbers
             ) {
            System.out.println(temp);

        }
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fiban20= new int[20];
        for (int count=0; count< fiban20.length; count++ ){
            if (count>=2){
                fiban20[count]=fiban20[count-2]+fiban20[count-1];
            }
            else {
                fiban20[count]=1;
            }
        }
        return fiban20;
    }

}
