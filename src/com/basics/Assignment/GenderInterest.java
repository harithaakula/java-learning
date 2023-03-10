package com.basics.Assignment;

public class GenderInterest {
    public static void main(String args[]) {
         String gender=args[0];
         int age=Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);

        if(gender=="Female") {
             if (age >= 1 && age <= 58) {
                 System.out.println("percentage of interest is 8.2%");
             } else if (age > 58 && age <= 100) {
                 System.out.println("percentage of interest is 9.2%");
             } else
                 System.out.println("No result");
         }
         else{
             if (age >= 1 && age <= 58) {
                 System.out.println("percentage of interest is 8.4%");
             } else if (age > 58 && age <= 100) {
                 System.out.println("percentage of interest is 9.4%");
             } else
                 System.out.println("No result");
         }

         }
    }

