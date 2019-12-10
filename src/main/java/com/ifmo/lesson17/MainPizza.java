package com.ifmo.lesson17;

public class MainPizza {


    public static void main(String[] args) {
        Pizza pereronnyPizza = new Pizza.Builder("yes", "yes")
                .meat(4).fish(50)
                .build();
    }
}

