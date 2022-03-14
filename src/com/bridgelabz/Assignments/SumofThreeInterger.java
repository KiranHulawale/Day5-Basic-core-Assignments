package com.bridgelabz;
import java.util.Scanner;

public class SumofThreeInterger {

  static   Scanner scanner=new Scanner(System.in);

    static void Sum(int n)
    {
        System.out.println("Please enter value");
        int count=0;
        //int n=scanner.nextInt();
        int[] array=new int[n];

        for (int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        count++;
                        System.out.println(array[i] + "+" + array[j] + "+" + array[k] + "=" + "add to 0");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the values");
        int n=scanner.nextInt();
        Sum(n);
    }
}
