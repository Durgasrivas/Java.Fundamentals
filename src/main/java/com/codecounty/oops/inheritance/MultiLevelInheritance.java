package com.codecounty.oops.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.test();
        String string = c.toString();
        System.out.println(string);
//        System.out.println(c.x);
//        A a = new A();
    }
}
    class A{
    int x = 10;
    private int y=80;
    }
    class B extends A{
        int x=100;
    }
    class C extends B{
        int x=1000;
        void test(){
            System.out.println(x);//1000
            System.out.println(super.x);//100
//            System.out.println(super.super.x);
        }
    }
