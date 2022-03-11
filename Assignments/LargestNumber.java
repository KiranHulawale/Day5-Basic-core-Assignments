package com.bridgelabz.Assignments;
 import java.util.Scanner;

 public class LargestNumber {
  public static void main(String[] args) {
   int a,b,c;
   System.out.println("Please enter 3 numbers");
   Scanner scanner=new Scanner(System.in);
   a=scanner.nextInt();
   b=scanner.nextInt();
   c=scanner.nextInt();
   if (a>=b && a>=c)
    System.out.println("Largest number is " +a);
   else if(b>=a && b>=c)
    System.out.println("Largest number is " +b);
   else
    System.out.println("Largest number is " +c);
  }
 }
