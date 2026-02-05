package com.codecounty.oops.exceptions;

public class MainError {
    static int counter = 0;

    public static void main(String[] args) {
        call();
    }

    static void call() {
        System.out.println("Calling "+ ++counter);
        call();
    }
}
