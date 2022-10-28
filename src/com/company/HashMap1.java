package com.company;
import java.util.*;
public class HashMap1 {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Kabul");
        hm.put(2, "Kandahar");
        hm.put(3, "Herat");

        // Finding the value for a key------------
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        hm.replace(2,"Zabul");
        System.out.println(hm.hashCode());
/*
        hm.clear();
        hm.containsKey();
        hm.get();
        hm.isEmpty();
        hm.remove();
        hm.size();
        hm.hashCode();
        */


    }
}
