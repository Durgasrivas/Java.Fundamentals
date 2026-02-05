package com.codecounty.oops.basics;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {

            for (int s = 0; s < rows - i; s++) {
                System.out.print("   ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-6d", num);
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

