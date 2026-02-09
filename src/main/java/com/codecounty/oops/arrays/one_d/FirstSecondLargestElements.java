package com.codecounty.oops.arrays.one_d;

import java.util.Scanner;
class FindSecondLargestElement {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("how many elements:");
        int num1 = s1.nextInt();
        System.out.println("enter the elements");
        int[] arr1 = new int[num1];

        for(int i=0; i<num1; i++){
            arr1[i] = s1.nextInt();
        }

        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i=0; i<num1; i++){
            if(arr1[i] > l){
                s = l;
                l = arr1[i];
            } else if (arr1[i] > s && arr1[i] != l) {
                s = arr1[i];
            }
        }
        System.out.println("the second largest element is " + s);
    }
}


