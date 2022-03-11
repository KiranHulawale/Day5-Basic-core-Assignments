package com.bridgelabz.Assignments;

import  java.util.Random;
import java.lang.*;
import java.util.Scanner;

public class PrimeFactors {
    public static boolean isPrime(int i)
    {
        for (int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Prime factor is" +num);

        for (int i=2;i<=num;i++)
        {
            if (isPrime(i))
            {
                System.out.println("Prime number is" +i);
            }
        }
    }
}
