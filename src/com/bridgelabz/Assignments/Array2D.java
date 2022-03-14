package com.bridgelabz;
import java.util.Scanner;
import  java.io.PrintStream;

public class Array2D {

    static Scanner scanner = new Scanner(System.in);
    PrintStream ps = new PrintStream(System.out);

    static void IntTwoArray(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter value");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("" + array[i][j]);
            }
        }
    }

    static void BooleanTwoArray(int m, int n) {
        Boolean[][] array = new Boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter value");
                array[i][j] = scanner.nextBoolean();
            }
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("" + array[i][j]);
            }
        }
    }

    static void DoubleTwoArray(int m, int n) {
        Double[][] array = new Double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter value");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("" + array[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter value for m");
        int m=scanner.nextInt();
        System.out.println("Please enter value for n");
        int n=scanner.nextInt();
        System.out.println("Please select the array type \n 1. Integer\n 2. Double\n 3. Booleans");
        int choice=scanner.nextInt();

        switch (choice)
        {
            case 1:
                    IntTwoArray(m,n);
                    break;
            case  2:
                    DoubleTwoArray(m,n);
                    break;
            case  3:
                    BooleanTwoArray(m,n);
                    break;
        }
    }
}


