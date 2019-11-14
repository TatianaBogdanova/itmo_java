package com.ifmo.lesson10;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtils {

    public static <T> Iterable<T> view (Iterable...iterables){

        int lenIterables = iterables.length;
        if (lenIterables == 0){
            return null;
        }
        else {
            for (int count =0; count < iterables.length; count++){
                if (iterables[count].iterator().hasNext() == true){

                }
                else{
                    return (Iterable<T>) iterables[count].iterator();
                }

            }
        }
        return new MyIterable<>();
    }

    public static class MyIterable<T> implements Iterable<T>{

        @Override
        public Iterator<T> iterator() {
            return null;
        }
    }



    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new LinkedList<>();

        list1.add("1");
        list1.add("2");

        list2.add("3");
        list2.add("4");

        list3.add("5");
        list3.add("6");

        Iterable<String> view = view(list1,list2,list3);

        for(String s: view){
            System.out.println(s);
        }
    }
}
