package com.basics.Assignment;

public class ReceiveCommandArgs {
    public static void main(String args[]) {
        int i= args.length;
        if (i == 0) {
            System.out.println("No values");
        }
else{
                for (int j=0 ;j<i;j++) {
                    System.out.print(args[j] +",");
                }
            }
        }
    }
