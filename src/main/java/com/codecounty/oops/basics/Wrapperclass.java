package com.codecounty.oops.basics;

public class Wrapperclass {
    public static void main(String[] args){
        int x=10;
        Integer x1= new Integer(x);
        Boolean bool1=new Boolean(false);
        Boolean bool2=false;
        System.out.println(x);
        System.out.println(bool1);
        int y=193;
        Integer y1=y; //autounboxing
        int z=y;
    }
}
