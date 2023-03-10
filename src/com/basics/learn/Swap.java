package com.basics.learn;

public class Swap<x> {

        public static void main(String[] args){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = 0;
            System.out.println("a="+a+" b="+b);
            c = a;
            a = b;
            b = c;
            System.out.println("a="+a+" b="+b);
            int grade = 1;
            boolean isA = (90 <= grade && grade <= 100);
            System.out.println(isA);

            double xx = (double) (3.0/5.0);
            System.out.println(xx);

            long x = 65536;
            long y = x * x;
            System.out.println(y);
            boolean isSque =  (Math.sqrt(2) * Math.sqrt(2) == 2);
            System.out.println(isSque);
double div=17.0%0.0;
System.out.println(div);




        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        // divisible by 4
        isLeapYear = (year % 4 == 0);

        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println("isLeapYear::"+isLeapYear);
            double z=3.0;
            System.out.println(z);
            int threeInt = 3;
            int fourInt  = 4;
            double threeDouble = 3.0;
            double fourDouble  = 4.0;
            System.out.println(threeInt / fourInt);
            System.out.println(threeInt / fourDouble);
            System.out.println(threeDouble / fourInt);
            System.out.println(threeDouble / fourDouble);


        }


}

