package com.ifmo.lesson24;

import java.util.*;

public class MyBlockingDeque<T> {

    private LinkedList<T> queue= new LinkedList<T>();
    private Object monitor= new Object();
    private int size = 10;

    public T  take() {
        while (true)
        synchronized (monitor) {
            if (!Objects.equals(queue.size(), 0)) {
                T t = queue.get(0);
                queue.remove(0);
                return t;
            }
            else{
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean add(T t) {
        synchronized (monitor) {
            if (!Objects.equals(queue.size(), size))
                queue.add(t);
            else{
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return  true;
    }
}
