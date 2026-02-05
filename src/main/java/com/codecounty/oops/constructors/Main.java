package com.codecounty.oops.constructors;

public class Main {
    public static void main(String[] args){
        Marker m1 = new Marker();
        Marker m2 = new Marker();
//        System.out.println(m1.brand);
//        System.out.println(m1.color);
//        System.out.println(m1.price);

        m1.brand = "Luxar";
        m1.color = "black";
        m1.price = 30;

//        System.out.println(m1.brand);
//        System.out.println(m1.color);
//        System.out.println(m1.price);
//
//        System.out.println(m2.brand);
//        System.out.println(m2.color);
//        System.out.println(m2.price);

        Marker m3 = m2;
        System.out.println(m3.color);

        m2.color="RED";
        System.out.println(m3.color);

        System.out.println(m3);
        System.out.println(m3.hashCode());
    }
}
