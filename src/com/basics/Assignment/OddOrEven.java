package com.basics.Assignment;

public class OddOrEven {
    public static void main(String args[]){
        int a= Integer.parseInt(args[0]);
        if(a%2==0){
            System.out.println("Given number is Even   "+a);
        }else {
            System.out.println("Given number is Odd  "+a);
        }
    }
}
