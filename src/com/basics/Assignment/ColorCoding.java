package com.basics.Assignment;

import java.util.Scanner;

public class ColorCoding {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter color code");

        char color=scan.next().charAt(0);
        switch(color){
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            case 'B':
            case 'b':
                System.out.println("Blue");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            case 'Y':
            case 'y':
                System.out.println("Yellow");
                break;
            case 'W':
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
