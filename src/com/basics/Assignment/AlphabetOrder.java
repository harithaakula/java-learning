package com.basics.Assignment;

import java.util.Scanner;

public class AlphabetOrder {
    public static void main(String agrs[]){
        System.out.println("Enter Alphabets");

        Scanner s= new Scanner(System.in);

        char ch1=s.next().charAt(0);
        char ch2=s.next().charAt(0);

         if(ch1>ch2){
             System.out.println(ch2 + ","+ch1);
         }

         else {
            System.out.println(ch1+","+ch2);
        }
    }

}
