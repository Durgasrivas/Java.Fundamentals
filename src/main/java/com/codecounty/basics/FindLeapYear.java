package com.codecounty.basics;

public class FindLeapYear {
    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear = false;

        if (year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }else {
            isLeapYear = false;
        }
        if (isLeapYear){
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
