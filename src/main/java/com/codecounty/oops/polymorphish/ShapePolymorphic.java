package com.codecounty.oops.polymorphish;

public class ShapePolymorphic  {

    int area(int side) {
        return side * side;
    }

    int area(int len, int breadth) {
        return len * breadth;
    }

    float area(float base, float height) {
        return 0.5f * base * height;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    float area(float base, int height ){
        return base * height;
    }
}