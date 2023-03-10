package com.basics.Assignment;

public class Givennum {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        if(a>0){
            System.out.println("Given num is Positive  " +a);

        } else if (a<0){
           System.out.println("Given number is Negative  " +a);
        }else {
            System.out.println("Given number is zero  " +a);
        }
    }
}
