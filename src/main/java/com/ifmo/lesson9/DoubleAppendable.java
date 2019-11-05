package com.ifmo.lesson9;

import com.ifmo.lesson6.Operation;

public class DoubleAppendable<T extends Double> extends NumberAppendable<T> {
    T temp;
    static Operation operation;
    DoubleAppendable<T> numberNumberAppendable;

    public DoubleAppendable(Double temp, Operation operation) {
        super(temp, operation);
    }

    @Override
    public NumberAppendable<T> append(Number temp) {
        numberNumberAppendable = new DoubleAppendable<T>((Double) temp, this.operation);
        return numberNumberAppendable;
    }

    @Override
    public T value() {

        DoubleAppendable<T> tempNext = this.numberNumberAppendable;
        T  tempResult = this.temp;
        while (tempNext != null){
            operation.calculate(tempResult, tempNext.temp);
            tempNext = tempNext.numberNumberAppendable;
        }
        return tempResult;
    }
}
