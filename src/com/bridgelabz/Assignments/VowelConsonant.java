package com.bridgelabz.Assignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        ch=scanner.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

}
