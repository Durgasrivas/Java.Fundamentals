package com.codecounty.multithreading;

public class visibilityProblem {
    volatile static boolean flag = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (flag) {
                System.out.println("Stop me if you can !!");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            flag = false;
        });
        t2.start();
    }
}