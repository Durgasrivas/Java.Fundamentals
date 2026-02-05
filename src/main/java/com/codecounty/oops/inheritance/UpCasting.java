package com.codecounty.oops.inheritance;

public class UpCasting {
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println(c1.x);   // Parent variable
        System.out.println(c1.y);   // Child variable
        c1.fun1();                  // Parent method overridden
        c1.fun2();                  // Child method
    }
}

class Parent {
    int x = 8;

    void fun1() {
        System.out.println("Parent fun1");
    }
}

class Child extends Parent {
    int y = 99;

    void fun1() {
        System.out.println("Child fun1");  // overriding
    }

    void fun2() {
        System.out.println("Child fun2");
    }
}
