package com.codecounty.oops.basics;

import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //find naturl num
//        if (num>=0){
//            System.out.println("NaturalNum");
//        } else {
//            System.out.println("NotNaturalNum");
//        }
        int sum = 0;
//        for (int i = 0; i < num; i++){
//            sum += i;
//        }
        if (num > 0){
            sum = (num * (num +1))/2;
        }
        System.out.println(sum);
    }
}
