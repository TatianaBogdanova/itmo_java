package com.ifmo.lesson3;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int count =0; count < randomNumbers.length; count++){
            System.out.print(randomNumbers[count]+" ");
        }

        int evens = evens(randomNumbers);

        // TODO implement

        System.out.println("evens =" + evens);
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randNum = new int[15];
        for (int count =0; count < randNum.length; count++){
            randNum[count]=  (int)(Math.random()*10);
        }
        return randNum;
    }

    private static int evens(int[] arr) {
        // TODO implement
        int number=0;
        for (int count =0; count < arr.length; count++){
            if (arr[count]%2 == 0){
                number++;
            }
        }

        return number;
    }
}
