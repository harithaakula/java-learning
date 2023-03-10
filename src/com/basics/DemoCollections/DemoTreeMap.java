package com.basics.DemoCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mydata = new TreeMap<Integer,Integer>();

        mydata.put(19,21);
        mydata.put(9,21);
        mydata.put(7,21);
        mydata.put(9,21);
        mydata.put(19,null);
        mydata.put(6,7);
        mydata.put(8,9);
        mydata.put(5,21);

        Iterator it = mydata.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}


