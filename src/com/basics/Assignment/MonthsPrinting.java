package com.basics.Assignment;

import java.util.Scanner;

public class MonthsPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an month");
        int month = sc.nextInt();

       // int month= Integer.parseInt(args[0]);
        String monthStr="";
        switch(month){
            case 1: monthStr="January";
            break;
            case 2: monthStr="February";
            break;
            case 3: monthStr="March";
            break;
            case 4: monthStr="April";
            break;
            case 5: monthStr="May";
            break;
            case 6: monthStr="june";
                break;
            case 7: monthStr="july";
                break;
            case 8: monthStr="August";
                break;
            case 9: monthStr="September";
                break;
            case 10: monthStr="October";
                break;
            case 11: monthStr="November";
                break;
            case 12: monthStr="December";
                break;
            default:monthStr="Invalid month";
        }
        System.out.println(monthStr);
    }
}
