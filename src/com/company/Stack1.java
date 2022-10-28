package com.company;
import java.util.*;
public class Stack1 {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("ahmad");
        stack.push("jan");
        stack.push("khan");
        stack.push("rahim");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        stack.pop();

        System.out.println("-----------------------------------");
        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        /*stack.push();
        stack.peek();
        stack.empty();
        stack.pop();
        stack.search();
        stack.clear();
        stack.elements();
        stack.firstElement();
        stack.get();
        */
    }
}
