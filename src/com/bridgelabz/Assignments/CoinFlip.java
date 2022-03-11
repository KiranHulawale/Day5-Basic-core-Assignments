package com.bridgelabz.Assignments;

import java.util.Random;
import java.util.Scanner;


public class CoinFlip {

    public enum Coin{Head,Tail};
    static Random randomNum=new Random();
    static int result;
    static Coin coinFlip;

    public static void flip()
    {
        result=randomNum.nextInt(2);
        if(result==0)
        {
            coinFlip=Coin.Head;
            System.out.println("Head!!");
        }
        else
        {
            coinFlip=Coin.Tail;
            System.out.println("Tail!!");
        }
    }
    public static void  main(String[] args) {
        flip();
//            CoinToss test=new CoinToss();
//            int choice;
//        System.out.println("Toss the coin");
//        do {
//            System.out.println("Enter ");
//        }
}
