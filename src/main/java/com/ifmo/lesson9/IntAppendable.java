package com.ifmo.lesson9;

import com.ifmo.lesson6.Operation;

public class IntAppendable<T extends Integer> extends NumberAppendable<T> {
    T temp;
    static Operation operation;
    IntAppendable<T> numberNumberAppendable;

    public IntAppendable(Integer temp, Operation operation) {
        super(temp, operation);
    }

    @Override
    public NumberAppendable<T> append(Number temp) {
        numberNumberAppendable = new IntAppendable<T>((Integer) temp, this.operation);
        return numberNumberAppendable;
    }

    @Override
    public T value() {

        IntAppendable<T> tempNext = this.numberNumberAppendable;
        T  tempResult = this.temp;
        while (tempNext != null){
            operation.calculate(tempResult, tempNext.temp);
            tempNext = tempNext.numberNumberAppendable;
        }
        return tempResult;
    }
}
