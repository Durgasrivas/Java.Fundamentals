package com.codecounty.oops.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String... args){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(4);
        pq.add(42);
        pq.add(41);
        pq.add(-4);
        pq.add(50);
        pq.add(54);
        pq.add(14);
        System.out.println(pq);

        Integer poll1=pq.poll();
        System.out.println(poll1);

        System.out.println(pq);
        Integer poll2=pq.poll();
        System.out.println(poll2);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        for (Integer num:pq){
            System.out.println(num);
        }
    }
}
