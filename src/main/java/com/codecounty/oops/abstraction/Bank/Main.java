package com.codecounty.oops.abstraction.Bank;

import com.codecounty.oops.abstraction.interfaces.BankInterface;
import com.codecounty.oops.abstraction.interfaces.BankInterfaceImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount("Srivas", "UBI478",
                6581691276L, AccountType.SAVINGS);

        System.out.println(ac1);
        ac1.deposit(32, 3, 2323, 2, -9);
        System.out.println(ac1);

        ac1.withdraw(400);
        System.out.println(ac1);


//        BankAccountAbs ac2 = new BankAccountAbs("Srivas", "UBI478",
//                6581691276L, AccountType.SAVINGS);


        BankAccountAbs ac2 = new BankAccountAbsImpl("Srivas", "UBI478",
                6581691276L, AccountType.SAVINGS);


        BankAccountAbs ac3 = new BankAccountAbs("Srivas", "UBI478",
                6581691276L, AccountType.SAVINGS) {

            @Override
            void deposit(long... amounts) {//TODO

            }

            @Override
            void withdraw(long amount) {//TODO

            }
        };

        //Interface

        BankInterface bankInterface = new BankInterfaceImpl("Srivas", 4561,
                6581691276L, "UBI478", AccountType.SAVINGS);

        BankInterface ac4 = new BankInterface() {

            @Override
            public void deposit(long... amounts) {
                System.out.println("depositing :" + Arrays.toString(amounts));

            }

            @Override
            public void withdraw(long amount) {
                System.out.println("withdrawing :" + amount);

            }
        };
        ac4.withdraw(3454);
        ac4.deposit(1643,3344);


    }
}