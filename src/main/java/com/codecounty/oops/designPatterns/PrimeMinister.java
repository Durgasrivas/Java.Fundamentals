package com.codecounty.oops.designPatterns;

public class PrimeMinister {
    String name;
    int age;
    //    2.declare a static private variable of the same class
    private static PrimeMinister pm;

    //1.make the constructor private
    private PrimeMinister(String name, int age) {
//        public PrimeMinister(String name,int age){
        this.name = name;
        this.age = age;
    }

    //    3.make a static fn that will create an object for you
    static PrimeMinister declarepm(String name, int age) {
        if (pm == null) {
            pm = new PrimeMinister(name, age);
        }
        return pm;
    }

    @Override
    public String toString() {
        return "PrimeMinister{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
