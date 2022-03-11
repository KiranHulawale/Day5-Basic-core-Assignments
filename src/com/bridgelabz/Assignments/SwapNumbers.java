package com.bridgelabz.Assignments;
//import  java.util.Scanner;
import java.util.*;

public class SwapNumbers {

    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Before swap");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
