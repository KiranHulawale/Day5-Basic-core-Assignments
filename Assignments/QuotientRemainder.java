package com.bridgelabz.Assignments;

import  java.io.*;
import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for num1");
        System.out.println("Enter the value for num2");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int remainder=0;
        int quotient=0;
        quotient=num1/num2;
        remainder=num1%num2;
        System.out.println("Quotient when " + num1 + "/" + num2 + " is: " + quotient);
        System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is: " + remainder);
    }

}
