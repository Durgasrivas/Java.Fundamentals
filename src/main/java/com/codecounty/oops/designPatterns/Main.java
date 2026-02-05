package com.codecounty.oops.designPatterns;

public class Main {
    static void main(String[] args){
        PrimeMinister pm1=PrimeMinister.declarepm("Modi",56);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());

        PrimeMinister pm2 = PrimeMinister.declarepm("Rahul",45);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());
    }
}
