package com.basics.DemoCollections;

import java.util.Iterator;
import java.util.Queue;
import java.util.PriorityQueue;

public class DemoPriorityQueue<I extends Number> {
    public static void main(String[] args) {
        Queue<Integer>mydata = new PriorityQueue<Integer>() ;
        mydata.add(3);
        mydata.add(45);
        mydata.add(2);
        mydata.add(0);
        mydata.add(2);
        mydata.add(19);
        mydata.add(64);
        mydata.add(75);
        Iterator it =mydata.iterator();

        while (it.hasNext()){
            System.out.print(""+it.next()+" ");
        }
    }
}



