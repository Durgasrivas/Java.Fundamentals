package com.codecounty.oops.basics;

import java.util.Scanner;

public class PascalTri3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int s = 0; s < n-i; s++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
