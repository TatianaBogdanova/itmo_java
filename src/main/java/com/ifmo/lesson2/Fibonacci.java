package main.java.com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int param1 =1;
        int param2 = 1;
        for (int count =1; count <=11; count++){
            System.out.println(param1);
            int temp = param1;
            param1 = param2;
            param2 +=temp;
        }
    }
}
