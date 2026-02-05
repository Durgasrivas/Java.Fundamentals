package com.codecounty.oops.test;


import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String Date = sc.nextLine();
        String Month = sc.nextLine();
        String Year = sc.nextLine();
        int y=Integer.parseInt(Year);

        System.out.println(" "+Date+"-"+Month+"-"+Year);

        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
            System.out.println("is leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
