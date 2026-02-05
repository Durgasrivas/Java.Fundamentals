package com.codecounty.oops.basics;

public class MalFSquare {
    public static void main(String[] args) {
        int n=7;
        char ch = 'a';

        for (int i = 1; i <= n; i++){
//            for (int j = 0; j < n-i; j++){
//                System.out.print(" * ");
//            }
            for (int k = 1; k <= i; k++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}