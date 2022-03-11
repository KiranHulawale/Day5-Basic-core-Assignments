package com.bridgelabz.Assignments;

import java.util.Scanner;
import java.lang.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        double num=scanner.nextDouble();
        double result=0;
        System.out.println("The harmonic series is");
//        int i=num;
//        while (i>=0)
        for(int i=1;i<=num;i++)
        {
            //i--;
            result=result+(1/i);
            System.out.println("Harmonic value =" +result);
        }
    }
}
