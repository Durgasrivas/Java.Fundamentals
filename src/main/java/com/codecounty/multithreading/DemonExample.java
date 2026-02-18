package com.codecounty.multithreading;

public class DemonExample {
    public static void main(String[] args) {
        // Daemon threads are low priority thread
        Thread d1 = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Daemon thread working in the background ... ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Step 1: Mark the thread as daemon
        // this MUST be done before calling start()
        d1.setDaemon(true);

        // Step 2: Start the thread
        d1.start();

        // The Main thread (User Thread) will only run for 4 seconds
        try {
            System.out.println("Main thread is starting its work ... ");
            Thread.sleep(4000);
            System.out.println("Main thread is finishing ... ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting ... ");
    }
}
