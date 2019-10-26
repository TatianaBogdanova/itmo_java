package com.ifmo.lesson3;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int count =0; count < 10; count++){
            System.out.println(randomNumbers[count]);
        }

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        // TODO implement
        for (int count =0; count < 10; count++){
            System.out.println(randomNumbers[count]);
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randNum = new int[10];
        for (int count =0; count < 10; count++){
            randNum[count]= 1 + (int)(Math.random()*9);
        }
        return randNum;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        int[] randNum = randomNumbers.clone();
        for (int count = 0; count < randomNumbers.length/2; count++){
            randomNumbers[2*count+1]=0;
        }

        return randNum;
    }
}
