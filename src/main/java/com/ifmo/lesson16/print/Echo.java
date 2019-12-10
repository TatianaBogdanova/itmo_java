package com.ifmo.lesson16.print;

public class Echo {
    private final String text;

    public Echo(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Echo{" +
                "text='" + text + '\'' +
                '}';
    }
}
