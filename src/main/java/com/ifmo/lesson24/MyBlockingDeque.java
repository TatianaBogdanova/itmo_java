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
                MyBlockingDeque.this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!Objects.equals(queue.size(), 0)) {
                T t = queue.get(0);
                queue.remove(0);
                return t;
            }
            else{
                readyAdd = true;
                try {
                    MyBlockingDeque.this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean add(T t) {
        while (true) {
            synchronized (MyBlockingDeque.this) {
                if ((!Objects.equals(queue.size(), size)) && (readyAdd )){
                    queue.add(t);
                    MyBlockingDeque.this.notify();
                    return true;
                }
                else {
                    readyAdd = false;
                    MyBlockingDeque.this.notifyAll();
                }
            }
        }
//
    }
}
