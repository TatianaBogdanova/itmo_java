package main.java.com.ifmo.lesson2;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;

public class Dividers {
    /*
    Выведите на экран все положительные делители натурального числа, введённого
    пользователем с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // TODO implement
        for (int param = 1; param<=n; param++){
            if (n%param == 0){
                System.out.println(param);
            }
        }
    }
}
