package com.basics.Assignment;

public class CommandlineArgs {
    public static void main(String args[]){
        int length = args.length;
if(length>0){
    System.out.println(" received command line arguments ");
    for(int i=0;i<length;i++){
        System.out.print( args[i]+",");

    }
}else{
    System.out.println(" Not received command line arguments ");
}
    }

}
