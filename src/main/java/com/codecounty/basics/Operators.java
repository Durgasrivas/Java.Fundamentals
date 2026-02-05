package com.codecounty.basics;

public class Operators {
    public static void main(String[] args){
        //Assignment operators

        int x = 5;

        //arithematic operator + - / * %
        x=10%3;
        System.out.println(x);

        int a = 965;
        System.out.println(965%10);
        System.out.println(965/10);

        //unary operators

        int y;
        // System.out.println(y); //you cannot use a local variable useless its initialised

        y=10;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);

        x=100;
        y=90;
        x= ++x - --y + --x + y++ - x++ - --y - x--;
        System.out.println(x);
        System.out.println(y);

        //shorthand operator

        x=9;
        x=x+100;
        x += 1;
        x *= 5;
        System.out.println(x);

        //logical operator

        System.out.println(7 & 5);
        System.out.println(7 | 5);
        System.out.println(7 ^ 5);
        System.out.println(7 ^ 7);
        System.out.println(-7);

        System.out.println(8>>1);
        System.out.println(8<<1);
        System.out.println(8>>>1);

    }
}
