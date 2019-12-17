package com.ifmo.lesson24;


import java.util.*;

public class MyBlockingDeque<T> {

    private LinkedList<T> queue = new LinkedList<T>();
    private int size = 10;

    public T take() throws InterruptedException {
        synchronized (MyBlockingDeque.this) {
            while (queue.isEmpty()) {
                wait();
            }
            notify();
            return queue.remove(0);
        }
    }

    public boolean add(T t) throws InterruptedException {
        synchronized (MyBlockingDeque.this) {
            while (queue.size() == 10) {
                wait();
            }
            queue.add(t);
            notify();
            return true;
        }
    }
}
