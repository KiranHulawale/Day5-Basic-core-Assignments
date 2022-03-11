package com.bridgelabz.LogicalAssignments;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
//    int divisor(int x)
//    {
//        return x;
//    }
    }

