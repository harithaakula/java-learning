package com.basics.Assignment;

public class Prime10to99 {
    public static void main(String[] args) {

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for(int n=start;n<=end;n++) {
            boolean flag = false;
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("prime number: " +n);
            } else {
                System.out.println("not a prime number: "+n);
            }
        }
    }
}
