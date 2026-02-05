package com.codecounty.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(3, "John", "KTS");
//        System.out.println(st1.name);
//        System.out.println(st1.roll);
//
//        st1.name = "Donkey";
//        System.out.println(st1.name);
//        System.out.println(st1.roll);

        System.out.println(st1.info());
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());

        st1.setRoll(99);
        System.out.println(st1.info());

        //Employee

        Employee emp1 = new Employee("Sri", 234, "Java", true, 100000, 7693764738l);
        System.out.println(emp1.getEmpID());
        System.out.println(emp1.getName());
        System.out.println(emp1.getCompanyName());
        System.out.println(emp1.info());

        //Car

        Car car1 = new Car("BMW", "AM 656", 6.5f);
        System.out.println(car1.info());
    }
}
