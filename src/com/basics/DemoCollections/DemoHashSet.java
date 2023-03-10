package com.basics.DemoCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {

        Set<Integer> mydata =new HashSet<Integer>();

        mydata.add(3);
        mydata.add(45);
        mydata.add(2);
        mydata.add(null);
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
