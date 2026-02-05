package com.codecounty.oops.encapsulation;

public class Car {

    private String name;
     private String noplate;
    private float mielge;

    public Car(String name, String noplate, float mielge) {
        this.name = name;
        this.noplate = noplate;
        this.mielge = mielge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoplate() {
        return noplate;
    }

    public void setNoplate(String noplate) {
        this.noplate = noplate;
    }

    public float getMielge() {
        return mielge;
    }

    public void setMielge(float mielge) {
        this.mielge = mielge;
    }

    public String info() {
        return "Car{" +
                "name=" + name +
                ", noplate=" + noplate +
                ", mielge=" + mielge +
                '}';
    }
}
