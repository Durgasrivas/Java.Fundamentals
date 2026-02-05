package com.codecounty.basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //int

        byte a = 33; //find how bits are handled in the memory
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        short b = 678;
        int c = 6788;
        long d = 6788766;
        long pnum=7396294848L;
        System.out.println(pnum);

        //b = a;
        //a = b;//so you cannot put a data type that has higher memory requirement in a lower memory var IMPLICITLY
        System.out.println(b);

        //boolean

        boolean isJavaEasy = false;
        isJavaEasy = true;

        //char
        char ch = 'a';
        char rupee = '$';
        char rupeecode = rupee;
        System.out.println(rupeecode);

        int x = 686684;
        char xchar = (char)x;
        System.out.println(xchar);

        //floats
        float valueOfpi=3.14159f;//4 bytes
        System.out.println(valueOfpi);

        pnum=7396294848L;//8 bytes
        System.out.println(pnum);
        float pfloat = pnum;
        System.out.println(pfloat);

        double valueOfpiDouble = 3.14199;
        System.out.println(valueOfpiDouble);
    }
}
