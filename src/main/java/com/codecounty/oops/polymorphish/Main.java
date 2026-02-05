package com.codecounty.oops.polymorphish;

public class Main {
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println(shape.parallelogram(0.5f,8));
        System.out.println(shape.circle(10.0f));
        System.out.println(shape.square(8));
        System.out.println(shape.triangle(9,0.5f));

        ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
