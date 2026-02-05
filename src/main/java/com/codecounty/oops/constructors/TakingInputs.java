package com.codecounty.oops.constructors;

import java.util.*;

public class TakingInputs {
    public  static void main(String[] args){
        System.out.println("Enter Numbers");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println("inputNum");
        sc.nextLine();
        System.out.println("enter the Sentence");
        String word = sc.next();
        String sentence = sc.nextLine();
        System.out.println(sentence);
        System.out.println(sentence.length());

    }
}
