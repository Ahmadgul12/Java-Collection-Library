package com.company;
import java.util.*;

 /*The Deque supports the addition as well as the removal of elements from both ends of the data structure.
 Therefore, a deque can be used as a stack or a queue. We know that the stack supports the Last In First Out (LIFO) operation,
 and the operation First In First Out is supported by a queue. As a deque supports both,
 either of the mentioned operations can be performed on it. Deque is an acronym for "double ended queue".*/


/*Methods of Java Deque Interface
  Method	                Description
  boolean add(object)	It is used to insert the specified element into this deque and return true upon success.
  boolean offer(object)	It is used to insert the specified element into this deque.
  Object remove()	It is used to retrieve and removes the head of this deque.
  Object poll()	It is used to retrieve and removes the head of this deque, or returns null if this deque is empty.
  Object element()	It is used to retrieve, but does not remove, the head of this deque.
  Object peek()	It is used to retrieve, but does not remove, the head of this deque, or returns null if this deque is empty.
  Object peekFirst()	The method returns the head element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
  Object peekLast()	The method returns the last element of the deque. The method does not remove any element from the deque. Null is returned by this method, when the deque is empty.
  Boolean offerFirst(e)	Inserts the element e at the front of the queue. If the insertion is successful, true is returned; otherwise, false.
  Object offerLast(e)	Inserts the element e at the tail of the queue. If the insertion is successful, true is returned; otherwise, false.*/
public class Deque1 {

    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("Kabul");
        deque.offer("Herat");
        deque.add("Kandahar");
        deque.offerFirst("Zabul");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }

    }

}
