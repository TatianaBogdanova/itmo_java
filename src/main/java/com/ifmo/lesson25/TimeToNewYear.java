package com.ifmo.lesson25;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeToNewYear {
    public static void getTimeToNy(){
        LocalDate now = LocalDate.now();
        LocalDate ny = LocalDate.parse("2020-01-01");
        Period period = Period.between(now, ny);
        System.out.println(period.getMonths() + " " + period.getDays() );
    }




    public static void main(String[] args) throws InterruptedException {
        getTimeToNy();
    }
}
