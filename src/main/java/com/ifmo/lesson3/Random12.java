package main.java.com.ifmo.lesson3;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int count =0; count < randomNumbers.length; count++){
            System.out.print(randomNumbers[count]+" ");
        }

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        // TODO implement
        System.out.println("max =" + maxLastIndex);
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randNum = new int[15];
        for (int count =0; count < randNum.length; count++){
            randNum[count]= -15 + (int)(Math.random()*30);
        }
        return randNum;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max = randomNumbers[0];
        for (int temp: randomNumbers
             ) {
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
        for (int count =0; count <  randomNumbers.length; count++
        ) {
            if (randomNumbers[randomNumbers.length-1-count] == max){
                return      randomNumbers.length-1-count;
            }
        }

        return 0;
    }
}
