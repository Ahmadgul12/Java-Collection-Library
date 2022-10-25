package com.company;

import java.util.*;
class TreeSet1{
    public static void main(String args[]){
        //Creating and adding elements
        /*TreeSet<String> al=new TreeSet<String>();
        al.add("ahmad");
        al.add("khan");
        al.add("jan");
        al.add("wali");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(al);

        Iterator i=al.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        */

        //Lowest Value, Highest Value:
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());

        /*set.contains();
        set.descendingIterator();
        set.clear();
        set.comparator();
        set.first();
        set.isEmpty();
        set.last();
        set.remove();
        set.size();*/
    }
}