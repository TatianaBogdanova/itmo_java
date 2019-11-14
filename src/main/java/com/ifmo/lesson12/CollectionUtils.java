package com.ifmo.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtils {
//    public static <T, R> Iterable<R> view(R r, Predicate<T> predicate, Transformer< T, R> transformer,Iterable<T>...iterables) {
//        if (iterables.length == 0)
//            return null;//List.of();
//
//        return new Iterable<R>() {
//            @Override
//            public Iterator<R> iterator() {
//                return new Iterator<R>() {
//                    private int pos;
//                    private Iterator<T> current;
//
//                    @Override
//                    public boolean hasNext() {
//                        if (current == null)
//                            current = iterables[pos].iterator();
//
//                        if (!current.hasNext()) {
//                            pos++;
//
//                            if (pos < iterables.length) {
//                                current = iterables[pos].iterator();
//                            } else {
//                                return false;
//                            }
//                        }
//
//                        return current.hasNext();
//                    }
//                    @Override
//                    public R next() {
//                        if (predicate.isValid(current.next())) {
//                            return transformer.transform(current.next(),r);
//                        }
//                        else{
//                            return transformer.transform(current.next(), r);
//                        }
//                    }
//                };
//            }
//        };
//    }

    public interface Predicate<T>{
        boolean isValid(T value);
    }

    public static <T> List <T> filter(List<T> list){
        return list;
    }
     public interface Transformer<T,R>{
        R transform (T t, R r);
    }
//    public static <T> Iterable<T> view(Iterable<T>...iterables) {
//        if (iterables.length == 0)
//            return null;//List.of();
//
//        return new Iterable<T>() {
//            @Override
//            public Iterator<T> iterator() {
//                return new Iterator<T>() {
//                    private int pos;
//                    private Iterator<T> current;
//
//                    @Override
//                    public boolean hasNext() {
//                        if (current == null)
//                            current = iterables[pos].iterator();
//
//                        if (!current.hasNext()) {
//                            pos++;
//
//                            if (pos < iterables.length) {
//                                current = iterables[pos].iterator();
//                            } else {
//                                return false;
//                            }
//                        }
//
//                        return current.hasNext();
//                    }
//
//                    @Override
//                    public T next() {
//                        return current.next();
//                    }
//                };
//            }
//        };
//    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new LinkedList<>();

        list1.add("1");
        list1.add("2");
        list2.add("3");
        list2.add("4");
        list3.add("5");
        list3.add("6");

       // Iterable<String> view = view(Boolean.class, list1, list2, list3);

        list3.add("7");

        //Iterator<String> iterator = view.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for (String s : view) {
//            System.out.println(s); // 1, 2, 3, 4, 5, 6, 7
//        }
//
//        System.out.println("====");
//
//        list1.add(0, "0");
//
//        for (String s : view) {
//            System.out.println(s);
//        }
    }
}
