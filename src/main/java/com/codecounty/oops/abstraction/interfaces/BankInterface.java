package com.codecounty.oops.abstraction.interfaces;

import java.util.logging.Logger;

public interface BankInterface {

    //whatever you declare as variable they are public static final by default
    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());

    //only abstract fncn are allowed
    void deposit(long... amounts);

    abstract void withdraw(long amount);
}
