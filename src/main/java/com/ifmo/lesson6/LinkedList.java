package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList<T>  implements List<T>, Stack<T>, Queue<T>
{
    /** Ссылка на первый элемент списка. */
    private Item head;

    /** {@inheritDoc} */
    @Override
    public void add(T val) {
        this.add(val);
    }

    /** {@inheritDoc} */
    @Override
    public T take() {
        return this.take();
    }

    /** {@inheritDoc} */
    @Override
    public T get(int i) {
        return this.get(i);
    }

    /** {@inheritDoc} */
    @Override
    public T remove(int i) {
        return remove(i);
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    /** {@inheritDoc} */
    @Override
    public void push(T value) {
        this.push(value);
    }

    /** {@inheritDoc} */
    @Override
    public T pop() {
        return this.pop();
    }
}
