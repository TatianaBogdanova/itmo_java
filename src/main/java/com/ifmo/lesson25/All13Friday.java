package com.ifmo.lesson25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class All13Friday {

    public static int getNumber13Friday(int year){
        int count=0;
        for (int mount =0; mount < 12; mount++){
            LocalDate date = LocalDate.of(year, mount+1, 13);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.FRIDAY)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println(getNumber13Friday(2017));
    }
}
