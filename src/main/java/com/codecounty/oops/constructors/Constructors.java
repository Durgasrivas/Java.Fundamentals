package com.codecounty.oops.constructors;

public class Constructors {
    public static void main(String[] args){
//        Marker m1 = new Marker();
//        System.out.println(m1.brand);
//        System.out.println(m1.color);
//        System.out.println(m1.price);
        Marker m2 = new Marker(35,"Green","USPA");
        System.out.println(m2.color);
        System.out.println(m2.hashCode());
        System.out.println(m2.returnMe().hashCode());
    }
}
