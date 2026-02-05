package com.codecounty.oops.arrays.one_d;

import java.util.Arrays;

public class ArrayCloning {
    public static void main(String[] args){
        int arr [] = {1,2,3,4,5};
//        int [] dup = arr;
//        arr[0] = 10;
//        System.out.print(dup[0]);
        int[] clone = arr.clone();
        clone[0]=20;
        System.out.print("Cloned Array : \n"+ Arrays.toString(clone));
        System.out.print(arr[0]);
    }
}
