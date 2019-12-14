package com.ifmo.lesson24;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.*;

public class MyBlockingDeque<T> {

    private LinkedList<T> queue= new LinkedList<T>();
    private Object monitorTake= new Object();
    private Object monitorAdd= new Object();
    private int size = 10;
    private boolean readyAdd = true;

    public T  take() {
        while (true)
        synchronized (monitorTake) {
            if (!Objects.equals(queue.size(), 0)) {
                T t = queue.get(0);
                queue.remove(0);
                return t;
            }
            else{
                readyAdd = true;
            }
        }
    }

    public boolean add(T t) {
        synchronized (monitorAdd) {
            while (true) {
                if ((!Objects.equals(queue.size(), size)) && (readyAdd == true)) {
                    queue.add(t);
                    monitorAdd.notifyAll();
                    return true;
                }else{
                readyAdd = false;
            }
            }
//
        }
    }
}
