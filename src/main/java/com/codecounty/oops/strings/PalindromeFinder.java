package com.codecounty.oops.strings;

import java.util.Scanner;

public class PalindromeFinder {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "RaDaR";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
