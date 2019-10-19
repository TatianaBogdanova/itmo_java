package main.java.com.ifmo.lesson3;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        // TODO implement
        for (int count =0; count < randomNumbers1.length; count++){
            System.out.print(randomNumbers1[count]+" ");
        }
        System.out.println();
        for (int count =0; count < randomNumbers2.length; count++){
            System.out.print(randomNumbers2[count]+" ");
        }

        System.out.println();

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);

        // TODO implement
        if (average1 == average2){
            System.out.println(" equals");
        }
        else{
            System.out.println(( average1>average2)? "average1": "average2");
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randNum = new int[5];
        for (int count =0; count < randNum.length; count++){
            randNum[count]=  (int)(Math.random()*6);
        }
        return randNum;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int sum =0;
        for (int temp: randomNumbers
             ) {
            sum+=temp;

        }

        return sum/randomNumbers.length;
    }
}
