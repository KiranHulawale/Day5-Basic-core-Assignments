package com.bridgelabz.LogicalAssignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
//        int n=Integer.parseInt(args[0]);
//        int count=0;
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int n=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("Number is prime number" +n);
        }
        else
        {
            System.out.println("Not a prime number" +n);
        }
    }

}
