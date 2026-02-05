package com.codecounty.oops.test.test1;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0;
        int num1 = sc.nextInt();
        for(int i = 2;i<=num1;i++){
            boolean prime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime==true){
                num++;
                System.out.println(i);
            }
        }

    }
}
