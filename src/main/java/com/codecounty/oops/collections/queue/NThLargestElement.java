package com.codecounty.oops.collections.queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NThLargestElement {
    public static void main(String[] args){

        List<Integer> nums = List.of(33,254,325,2542,231,12,11,3332,52,534,633,33,232,32,67,23,4555,566);
        int n=0;

        HashSet<Integer> set = new HashSet<>(nums);
        if(set.size()<n){
            System.out.println("Invalid Input");
            return;
        }else{
            PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(set);

            for(int i=1;i<=n-1;i++){
                pq.poll();
            }
            System.out.println(pq.peek());
        }
    }
}
