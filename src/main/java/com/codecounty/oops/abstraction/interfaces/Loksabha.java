package com.codecounty.oops.abstraction.interfaces;

@FunctionalInterface
public interface Loksabha {
    void elect(int candidates);
//    void electDecision();

    static void members(){
        System.out.println("There are "+543+" members in Loksabha");
    }

    default void locationOfLoksabha(){
        System.out.println("Location in Delhi");
    }
}
