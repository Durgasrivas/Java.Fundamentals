package com.codecounty.oops.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsAndList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};//Another way to create list which we can change further
        System.out.println(list);

        Collections.sort(list);//sort the list
        System.out.println(list);

        Collections.reverse(list);//reverse the list
        System.out.println(list);

        Collections.shuffle(list);//shuffle the list elements
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Collections.copy(list2,list);
        System.out.println(list);
        System.out.println(list2);

        list.replaceAll(x->x*2);//It updates every element in the list by doubling its value.
        System.out.println(list);


        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("john",20));
        listOfStudents.add(new Student("Jack",21));
        listOfStudents.add(new Student("Jane",22));
        listOfStudents.add(new Student("Jill",23));

        System.out.println(listOfStudents);
        // Collections.sort(listOfStudents);//it will give error because java didnt know what to sort where to sort

        //2.using comparator implementation
        Collections.sort(listOfStudents,new NameComparator());

        //3.Using lamda fn
        Collections.sort(listOfStudents,(Student st1,Student st2)-> st1.name.compareTo(st2.name));

        listOfStudents.stream().forEach(System.out::println);



    }
}

class Student implements Comparable <Student> {//1.modify the Student class
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+" "+ age;
    }

    public int compareTo(Student st1){
        if(st1.age == this.age){
            return 0;
        }else if(st1.age>this.age){
            return 1;
        }else{
            return -1;
        }
    }
}
//2.Using comparator outside the class
class NameComparator implements Comparator<Student>{
    public int compare(Student st1,Student st2){
        return st1.name.compareTo(st2.name);
    }
}

