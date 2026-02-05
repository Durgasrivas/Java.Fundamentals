package com.codecounty.oops.abstraction.interfaces;

import com.codecounty.oops.abstraction.Bank.AccountType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Interfaces
        BankInterface bankInterface = new BankInterfaceImpl("Srivas", 4561,
                6581691276L, "UBI478", AccountType.SAVINGS);


        BankInterface ac4 = new BankInterface() {//Anonymous Inner Type

            @Override
            public void deposit(long... amounts) {

                System.out.println("depositing :" + Arrays.toString(amounts));
            }

            @Override
            public void withdraw(long amount) {
                System.out.println("Withdrawing :" + amount);


            }
        };
        ac4.withdraw(1000);
        ac4.deposit(1000, 2000);

        ComplexCaseImpl c1 = new ComplexCaseImpl();
        c1.ring();
        c1.ring1();
//        ComplexCase.call1();


    }
}
