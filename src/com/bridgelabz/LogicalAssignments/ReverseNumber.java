package com.bridgelabz.LogicalAssignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=0;
        int reverseNum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while (num != 0)
        {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse number is: " +reverseNum);

    }
}
