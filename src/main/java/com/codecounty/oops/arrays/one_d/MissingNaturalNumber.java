package com.codecounty.oops.arrays.one_d;

public class MissingNaturalNumber {
    public static void main(String[] args){
        int n=5;
        int[] nums= {1,4,3,2};
        int ans=0;
        for(int i=1; i<=n; i++){
            ans ^= i;
        }
        for(int i = 0; i< nums.length; i++){
            ans ^= nums[i];
        }
        System.out.println(ans);
    }
}
