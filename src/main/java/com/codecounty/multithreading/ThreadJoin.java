package com.codecounty.multithreading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start " + Thread.currentThread());
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello " + i + " from " + Thread.currentThread());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t1.join();
        System.out.println(t1.getStackTrace());
    }
}
