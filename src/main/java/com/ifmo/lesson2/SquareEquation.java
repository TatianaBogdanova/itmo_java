package main.java.com.ifmo.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
        if (((b*b- 4*a*c) >= 0.0) && (a != 0)){
            double[] mas = new double[2];
            mas[0] = (-b+Math.sqrt(b*b- 4*a*c))/2*a;
            mas[1] = (-b-Math.sqrt(b*b- 4*a*c))/2*a;
            return mas;
        }
        return null;
    }
}
