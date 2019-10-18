package main.java.com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {

        return new Random().nextInt( 1000);
    }

    public static String largestDigit(int rnd) {

        int max = 0;

        int first = rnd/100;
        int second = (rnd - first*100)/10;
        int therd = rnd - first*100 - second* 10;
        if ((first >= second) && (first>= therd) ){
            max = first;
        }
        else     if ((second >= first) && (second>= therd) ){
            max = second;
        }
        else {
            max = therd;
        }

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
