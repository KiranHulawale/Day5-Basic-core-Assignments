package com.bridgelabz.LogicalAssignments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int Num=0;
        int previousNum=0;
        int nextNum=1;
        System.out.println("Numbers you want in fibonacci");
        Scanner sc=new Scanner(System.in);
        Num=sc.nextInt();
        System.out.println("Fibonacci series of numbers" +Num);
        for (int i=0;i<=Num;++i)
        {
            System.out.println("Previous number" +previousNum);
            int sum=previousNum+nextNum;
            previousNum=nextNum;
            nextNum=sum;
        }
    }
}
