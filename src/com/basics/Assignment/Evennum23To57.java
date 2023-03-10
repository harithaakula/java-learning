package com.basics.Assignment;

public class Evennum23To57 {
    public static void main(String args[]) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        for (int i= start ; i <=end; i++) {
            if (i % 2 == 0) {
                System.out.println("EvenNumber:: " + i);
            }

        }
    }
}
