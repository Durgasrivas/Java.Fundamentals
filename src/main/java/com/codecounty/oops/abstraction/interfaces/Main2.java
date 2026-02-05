package com.codecounty.oops.abstraction.interfaces;

public class Main2 {
    public static void main(String[] args){
        //1
        LokSabhaImpl l1 = new LokSabhaImpl();
        l1.elect(8);
        l1.locationOfLoksabha();

        //2
        Loksabha l2 = new Loksabha(){
            @Override
            public void elect(int candidate) {
                System.out.println("Election is near");
            }
        };
        l2.elect(8);
        l2.locationOfLoksabha();

        //3
        Loksabha l3 = (int candidate) -> {
            System.out.println("Election is live");
        };
        l3.elect(8);
        l3.locationOfLoksabha();
    }
}
