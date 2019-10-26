package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {
        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int count =0;
        for( int first =0; first <=23; first++){
            for (int second =0; second <=59; second++){
                String firstDataString;
                if (new StringBuffer(String.valueOf(first)).reverse().toString().length() < 2){
                    firstDataString=new StringBuffer(String.valueOf(first)).reverse().toString()+"0";
                }
                else{

                    firstDataString=new StringBuffer(String.valueOf(first)).reverse().toString();

                }
                if (firstDataString.equals(String.valueOf(second))){
                    count++;
                }
            }
        }

        return count;
    }
}
