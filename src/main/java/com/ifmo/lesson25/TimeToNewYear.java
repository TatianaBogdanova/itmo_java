package com.ifmo.lesson25;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeToNewYear {
    public static void getTimeToNy() {

        Duration between = Duration.between(Instant.now(), Instant.parse("2020-01-01T00:00:00.00Z"));
        System.out.println("days" + between.toDays() + " "
                + " hours"+ (between.toHours()  - between.toDays()*24)  + " "
                + " minut"+ (between.toMinutes() - (between.toHours()  - between.toDays()*24) *60 - between.toDays() *24*60));
    }

    public static void myLongLife() {

        Duration between = Duration.between(Instant.now(), Instant.parse("1988-04-05T17:00:00.00Z"));
        System.out.println("sec" + between.toMinutes()*60);
    }

    public static void main(String[] args) throws InterruptedException {
        getTimeToNy();
        myLongLife();
    }
}
