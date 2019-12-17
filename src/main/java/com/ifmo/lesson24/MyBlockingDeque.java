package com.ifmo.lesson24;


import java.util.*;

public class MyBlockingDeque<T> {

    private LinkedList<T> queue = new LinkedList<T>();
    private int size = 10;

    public T take() throws InterruptedException {
        synchronized (MyBlockingDeque.this) {
            while (true) {
                if (!queue.isEmpty()) {
                    T t = queue.remove(0);
                    return t;
                }
                wait();

            }
        }
    }

    public boolean add(T t) {
        while (true) {
            synchronized (this) {
                if (queue.size() != size) {
                    queue.add(t);
                    notifyAll();
                    return true;
                } else {
                    notifyAll();
                }
            }
        }
//
    }
}
