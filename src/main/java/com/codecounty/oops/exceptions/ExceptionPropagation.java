package com.codecounty.oops.exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {

        ExceptionPropagation ep = new ExceptionPropagation();
        try {
            ep.callA();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        //we should not include catch with throwable as it catches errors as well
        //t.printStackTrace();
        System.out.println("End");
    }

    private void callA() throws InterruptedException {
        System.out.println("callA");
        callB();
    }

    private void callB() throws InterruptedException {
        System.out.println("callB");
        callC();
    }

    private void callC() throws InterruptedException {
        System.out.println("callC");

        Thread.sleep(576);
        System.out.println("END");

    }
}
