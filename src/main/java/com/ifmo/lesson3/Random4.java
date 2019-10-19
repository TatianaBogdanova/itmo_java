package main.java.com.ifmo.lesson3;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        System.out.println(isIncreasingSequence(randomNumbers));
    }

    public static int[] randomNumbers() {
        // TODO implement

        return new int[]{(int) (Math.random() * 90) + 10,(int) (Math.random() * 90) + 10,(int) (Math.random() * 90) + 10,(int) (Math.random() * 90) + 10 };
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement

        for (int count=1; count< randomNumbers.length; count++
             ) {
            if (randomNumbers[count-1]> randomNumbers[count]){
                return false;

            }


        }

        return true;
    }
}
