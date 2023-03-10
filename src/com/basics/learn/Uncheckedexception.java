package com.basics.learn;

public class Uncheckedexception {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("a=" + a + " b=" + b);
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
                int num[] ={10,20,30,40,50,60};
                System.out.println(num[7]);
            }
        }
