package com.ifmo.lesson9;

import com.ifmo.lesson6.Operation;

public abstract class NumberAppendable<T extends Number> implements Appendable<T> {
    Number temp;
    static Operation operation;
    //NumberAppendable<Number> numberNumberAppendable;

    public NumberAppendable(Number temp, Operation operation) {
        this.temp = temp;
        this.operation = operation;
    }

    @Override
    public abstract NumberAppendable<T> append(Number temp); //{
        //numberNumberAppendable = new NumberAppendable<Number>(temp, this.operation);
        //return numberNumberAppendable;
    //}

    @Override
    public abstract T value();
    // {

//        NumberAppendable<Number> tempNext = this.numberNumberAppendable;
//        Number  tempResult = this.temp;
//        while (tempNext != null){
//            operation.calculate(tempResult, tempNext.temp);
//            tempNext = tempNext.numberNumberAppendable;
//        }
//        return tempResult;
//    }
}
