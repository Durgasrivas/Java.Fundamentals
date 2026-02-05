package com.codecounty.oops.strings;

public class BattleOfStrings {
    public static void main(String[] args){
        String s1 = "Hello";
        long start = System.nanoTime();
        for (int i = 0; i < 101000; i++){
            s1 += " World";
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
