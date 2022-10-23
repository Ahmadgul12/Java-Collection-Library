package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //-----------ArrayList class
//        Java ArrayList class uses a dynamic array
//        for storing the elements. It is like an array, but there is no size limit.

//        ArrayList <String> list=new ArrayList<>();
//        list.add("ahmad");
//        list.add("jan");
//        list.add("someone else");
//        System.out.println(list);

        //Iterating ArrayList using Iterator
//        Iterator iterator= list.iterator();
//
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
        //Iterating ArrayList using For-each loop
        /*for (String names:list)
        {
            System.out.println(names);
        }*/


//        System.out.println(list.get(2));
//        list.add(2, "ahmadgul");
//        System.out.println(list.get(2));
//        list.isEmpty();
//        list.indexOf();
//        list.clear();
//        list.remove();
//        list.size();
//        list.contains();
//        list.removeAll();
        //---------------------------------------LinkedList class
        //LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.

        LinkedList<String> list=new LinkedList<String>();
        list.add("ahmad");
        list.add("jan");
        list.add("someone else");

        Iterator iterator= list.listIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        list.add(1,"ahmadjan");
        System.out.println("after adding by index"+ list);
        list.addFirst("Kabul");
        System.out.println("after adding at first index"+ list);
        list.addLast("Kandahar");
        System.out.println("after adding at end"+ list);
        list.remove();
        System.out.println("after remove first"+ list);
        list.remove("ahmad");
        System.out.println("after removing  by Object "+ list);
        list.remove(2);
        //some important functions that can be used on LinkList
//        list.clear();
//        list.contains();
//        list.get();
//        list.getFirst();
//        list.getLast();
//        list.indexOf();
//        list.pop();
//        list.push();
//        list.set();
//        list.size();
//        list.isEmpty();

        Iterator descendingIterator= list.descendingIterator();

        while (descendingIterator.hasNext())
        {
            System.out.println(descendingIterator.next());
        }
    }
}
