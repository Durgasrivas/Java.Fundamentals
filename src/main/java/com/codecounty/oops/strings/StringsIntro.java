package com.codecounty.oops.strings;

public class StringsIntro {
    public static void main(String[] args){
        String s1 = new String("Hello Kitty");
        String s2 = "Hello Kitty";
        String s3 = "Hello Kitty";
        String s4 = new String("Hello Kitty");

        if (s2 == s3) {
            System.out.println("EQUAL");

        }else
            System.out.println("NOT EQUAL");

        if (s1.equals(s2)) {
            System.out.println("EQUAL VALUE");
        }else
            System.out.println("NOT EQUAL VALUE");

        String s5 = "Hello Kitty";
    }
}
