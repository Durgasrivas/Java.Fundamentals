package com.codecounty.oops.exceptions;

import java.util.Scanner;

public class TryCatchCombo {
    public static void main(String[] args) {

        //since scanner is an indirect child at Autocloseable so we can put in try with resorce
        //and it will be auto closed
        try (Scanner sc = new Scanner(System.in);
             Scanner sc2 = new Scanner(System.in);
        ) {
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                Thread.sleep(200);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block executed ");
//            sc.close();
        }
    }
}