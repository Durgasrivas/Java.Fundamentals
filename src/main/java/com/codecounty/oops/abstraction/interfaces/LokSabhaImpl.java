package com.codecounty.oops.abstraction.interfaces;

public class LokSabhaImpl implements Loksabha{

    @Override
    public void elect(int candidates) {
        System.out.println("Election is coming for candidates "+candidates);
    }
}
