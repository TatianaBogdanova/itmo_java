package com.ifmo.lesson9;

public class tmpMain {
    public static void main(String[] args) {
        StringAppendable<String> stringStringAppendable = new StringAppendable<String>(null, " ,");
        stringStringAppendable.append("123").append("128");

        System.out.println(stringStringAppendable.value());
    }
}
