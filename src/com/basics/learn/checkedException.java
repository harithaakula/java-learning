package com.basics.learn;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader file = new FileReader("/opt/somefile.txt");
    }
}
