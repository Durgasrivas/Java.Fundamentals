package com.codecounty.oops.constructors;

public class Marker {
        //instance var which are developed inside the class
        int price;//0
        String color;//null
        String brand;//null

        /* marker is constructor
        * - no return type
        * - name should exactly match class name
        * - it will be only triggered once automatically while object creation
        * - you cannot trigger the fn yourself
        * - its used for initialising things
        * - JVM creates a default constructor in the runtime only and only if u havent created one
        * - this points to the current object
        * - this can be used for constructor chaining
        * - this holds the address of the current object
         */
        Marker(){
                this(4,"BOOM");
                System.out.println("Marker() called");
        }

        Marker(int price, String color){
                //this();
                System.out.println("Marker(int price, String color) called");
                this.price=price;
                this.color=color;
        }
        Marker(int price, String color, String brand){
                this();
                System.out.println("Marker(int price, String color, String brand) called");
                this.price = price;
                this.color = color;
                this.brand = brand;
                System.out.println(this);
                System.out.println(brand);
                System.out.println(color);
                System.out.println(price);
        }
        void write(){
            System.out.println("Writing with a"+color+"ink");
        }
        void throwing() {
                System.out.println("Throwing the marker");
        }
        Marker returnMe(){
                return this;
        }
    }
