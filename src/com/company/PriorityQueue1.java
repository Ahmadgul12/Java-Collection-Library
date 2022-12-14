package com.company;
import  java.util.*;
public class PriorityQueue1 {
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("afghanistan");
        queue.add("Iran");
        queue.add("India");
        queue.add("japan");
        queue.add("China");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        /*
            Methods of Java Queue Interface
    Method	                        Description
    boolean add(object)	It is used to insert the specified element into this queue and return true upon success.
    boolean offer(object)	It is used to insert the specified element into this queue.
    Object remove()	It is used to retrieves and removes the head of this queue.
    Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
    Object element()	It is used to retrieves, but does not remove, the head of this queue.
    Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
         */
    }
}
