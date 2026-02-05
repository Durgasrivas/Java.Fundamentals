package com.codecounty.oops.inheritance;

class Animal {
    boolean isExtinct;
    void eat() {
        System.out.println("this animal eats");
    }
}
class Bird extends Animal {
    int wingspan;
    void fly() {
        System.out.println("this bird is flying high!");
    }
}
public class TypeCasting {
    public static void main(String[] args) {
//        Animal myAnimal = new Bird();//Upcasting (Always safe)
        Bird b1 = new Bird();//Upcasting (Always safe)
        b1.eat();
        b1.fly();
        System.out.println(b1.wingspan);
        System.out.println(b1.isExtinct);

        Animal a2 = b1;
        a2.eat();
        System.out.println(a2.isExtinct);

        Animal a3 = new Bird();

//DownCasting is Explicit and is tricky
//        Animal a4 = new Animal();
//        Bird b2 = (Bird) a4;

//
//        1.Check if a3 is actually Bird
        if (a3 instanceof Bird) {
            //2.Safely TypeCast Animal to Bird
            Bird myBird = (Bird) a3;
            //3.Now we can use Bird specific methods
            myBird.fly();
            myBird.eat();
        }
        else{
            System.out.println("This animal cannot fly. Downcasting falied.");
        }

        Animal a5 = new Bird();
        if(a5 instanceof Bird b){
            b.fly();
            b.eat();
        }
    }
}