package com.bridgelabz.Assignments;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = 5;
        System.out.println("power of 2 is" +(Math.pow(2, num)));

        for(int i=0;i<=num;i++)
        {
            System.out.println("power of 2^"+i+" is:" +(Math.pow(2,i)));
        }
    }
}
