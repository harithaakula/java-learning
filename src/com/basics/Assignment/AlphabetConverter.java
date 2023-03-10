package com.basics.Assignment;
import java.util.Scanner;

public class AlphabetConverter {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       // take phabet from user
        System.out.println("Enter an alphabet");
        char alphabet = sc.next().charAt(0);
        char newAlphabet;
       if(Character.isUpperCase(alphabet)) {
           newAlphabet = Character.toLowerCase(alphabet);
       }else{
        newAlphabet=Character.toUpperCase(alphabet);
       }
        System.out.println(alphabet + "->" + newAlphabet);

    }
}