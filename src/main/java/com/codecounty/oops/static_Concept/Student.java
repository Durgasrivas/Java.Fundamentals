package com.codecounty.oops.static_Concept;

public class Student {
    int id;
    String name;
    static String collegeName;

    static {
        System.out.println("static 1 block executed");
        collegeName = "IIT";
        //System.out.println(name);//istide static blocks dont try to access NON static stuff
    }

    {
        System.out.println("Normal Block 1");
    }

    static {
        System.out.println("static 2 block executed");
    }

    {
        System.out.println("Normal Block 2");
    }

    static{
        System.out.println("static 3 block executed");
    }

    public Student(int id, String name, String college) {
        System.out.println("Student constructor called < <");
        this.id = id;
        this.name = name;
        //collegeName = college;
    }

    static void callMe(){
        //inside static blocks and fn, you can only access static things.
        System.out.println("Call me() <<");
//        System.out.println(id);
//        info();
        System.out.println(collegeName);
    }

    public String info() {
//         But Inside normal blocks/fn you can access everything
        callMe();
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
