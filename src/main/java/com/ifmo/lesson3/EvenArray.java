package main.java.com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();

        // TODO implement
        for (int temp: evenArray
             ) {
            System.out.print(temp + " ");
        }
        for (int temp: evenArray
        ) {
            System.out.println(temp + " ");
        }
    }

    public static int[] evenArray() {
        // TODO implement

        return new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    }
}
