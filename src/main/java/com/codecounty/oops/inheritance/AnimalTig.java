package com.codecounty.oops.inheritance;

public class AnimalTig {
    String name;
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        tiger.run();
        tiger.name="Royal Bengal Tiger";
        tiger.age=40;
        System.out.println(tiger);
    }
    void run(){
        System.out.println("Animal is running");
    }
}

class Tiger extends AnimalTig{
    int age;

    @Override
    void run(){
        System.out.println("Tiger is running");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", name='" + name +
                '}';
    }
}
