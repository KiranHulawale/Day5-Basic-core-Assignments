package com.bridgelabz;

public class Example {

    static void Sum(int a, int b)
    {
        int sum =a+b;
        System.out.println("Sum "+sum);
    }

    static void Subtract(int a, int b)
    {
        int subtraction =a-b;
        System.out.println("Substractoin is "+subtraction);
    }

    static void Product(int a, int b)
    {
        int multiplication =a*b;
        System.out.println("Multiplication is "+multiplication);
    }

    static void Division(int a, int b)
    {
        int division =a/b;
        System.out.println("Division is "+division);
    }

    static void Modulus(int a, int b)
    {
        int modulus =a%b;
        System.out.println("Modulus is "+modulus);
    }

    public static void main(String[] args) {
        int firstNum=10;
        int secondNum=20;
        Sum(firstNum,secondNum);
        Subtract(firstNum,secondNum);
        Product(firstNum,secondNum);
        Division(firstNum,secondNum);
        Modulus(firstNum,secondNum);
        /*int firstNum=10;
        int secondNum=20;
        int sum=firstNum+secondNum;
        System.out.println("Sum is:" +sum);*/
    }



}
