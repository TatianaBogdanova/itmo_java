package com.ifmo.lesson9;

public class StringAppendable<T> implements Appendable<String> {
    String temp;
    static String separator;
    StringAppendable<String> stringStringAppendableParam;

    public StringAppendable(String temp, String separator) {
        this.temp = temp;
        this.separator = separator;
    }

    @Override
    public StringAppendable<String> append(String temp) {
        stringStringAppendableParam = new StringAppendable<String>(temp, this.separator);
        return stringStringAppendableParam;
    }

    @Override
    public String value() {

        StringAppendable<String> tempNext = this.stringStringAppendableParam;
        String  tempResult = this.temp;
        while (tempNext != null){
            tempResult += separator;
            tempResult+=tempNext.temp;
            tempNext = tempNext.stringStringAppendableParam;
        }
        return tempResult;
    }
}
