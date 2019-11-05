package com.ifmo.lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Accumulator<T extends  Number> {
    T value;
    Set<Operation> op = new LinkedHashSet<>();

    public Accumulator(T value, Operation op) {
        this.value = value;
        this.op.add(op);
    }

    public T accumulate(T v) {
        T tempValue = value;
        int count = 0;
        for (Operation tempOperation : op) {
            if (count == 0){
                tempValue = (T) tempOperation.calculate(v, tempValue);
                count++;
            }
            else{
                tempValue = (T) tempOperation.calculate(tempValue, tempValue);
            }
        }

        return tempValue;
    }

    public T getValue() {
        return value;
    }

    public void addOperation(Operation op) {
        this.op.add(op);
    }



    public static void main(String[] args)
    {
        Accumulator accumulator = new Accumulator(170, new Plus());
        accumulator.addOperation(new Plus());
        accumulator.addOperation(new Plus());

        System.out.println(accumulator.accumulate(10));
    }
}
