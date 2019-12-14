package com.ifmo.lesson24;


import java.util.*;

public class MyBlockingDeque<T> {

    private LinkedList<T> queue= new LinkedList<T>();
    private int size = 10;
    private boolean readyAdd = true;

    public T  take() {
        while (true)
        synchronized (MyBlockingDeque.this) {
            try {
                if (!queue.isEmpty()) {
                    T t = queue.get(0);
                    queue.remove(0);
                    readyAdd = true;
                    return t;
                }
                else{
                    wait();
                    readyAdd = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public boolean add(T t) {
        while (true) {
            synchronized (this) {
                if (queue.size() != size){
                    queue.add(t);
                    notifyAll();
                    return true;
                }
                else {
                    readyAdd = false;
                    notifyAll();
                }
            }
        }
//
    }
}
