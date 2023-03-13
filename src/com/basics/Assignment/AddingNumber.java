package com.basics.Assignment;

public class AddingNumber {
    public static void main(String[] args) {
        int n = 123;
        int sum;

        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10,
                n /= 10);

        System.out.println(sum);
    }

}
