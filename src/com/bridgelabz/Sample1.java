package com.bridgelabz;

public class Sample1 {

    //local,instance and static-types of variables

        static int staticVar;//class level variable, only loaded once at class loading,only one copy of this variable shared among all te members


        public static int m1(int var)
        {
            int x=10;
            System.out.println("var"+var);
            System.out.println(x);
            return x+staticVar;
        }
    public static void main(String[] args) {
        int x=0; //local variable
        int returnVal=m1(x);
        System.out.println(staticVar);
        for(int i=0;i<5;i++)
        {
            int y=10;
            System.out.println(i+y);
        }
        System.out.println("x"+x);
        staticVar=20;
        System.out.println(staticVar);
    }
}
