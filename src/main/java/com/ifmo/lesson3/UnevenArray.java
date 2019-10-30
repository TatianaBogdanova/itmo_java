package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();

        // TODO implement
        for (int count =0; count < unevenArray.length; count++){
            System.out.print(unevenArray[count]+" ");
        }

        System.out.println();
        for (int count =0; count < unevenArray.length; count++){
            System.out.print(unevenArray[unevenArray.length-1-count]+" ");
        }
    }

    public static int[] unevenArray() {
        // TODO implement
        int max =99;
        int min =1;
        int[] array = new int[(max-min)/2+1];
        for (int count =0; count < array.length; count++){
            array[count]=  min+count*2;
        }
        return array;
    }
}
