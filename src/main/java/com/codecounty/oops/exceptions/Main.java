package com.codecounty.oops.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Scanner sc = new Scanner(System.in);

        int[] arr = {23, 43, 5, 6, 0};

        try {
            int num = sc.nextInt();
            System.out.println(10 / arr[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        } catch (Exception e) { //Always put the default Exception block at the end
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
