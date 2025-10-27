
package Midterm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queuetest {
    public static void main(String[] args) {
//        Queue <String> queue = new LinkedList <String> ();
//        // instertion
//        queue.offer("March");
//        queue.offer("April");
//        queue.offer("May");
//        queue.offer("June");
//        queue.offer("July");
//        queue.offer("December");
//        
//        System.out.println(queue.poll());
//        
//        System.out.println(queue);
//        System.out.println(queue.peek());

    PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    pq.add (10);
    pq.add (30);
    pq.add (50);
    pq.add (20);
    pq.add (70);
    pq.add (90);
    
        System.out.println(pq);
        
    }
}
