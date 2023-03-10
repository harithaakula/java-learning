package com.basics.DemoCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mydata = new HashMap<Integer,Integer>();


        mydata.put(9,21);
        mydata.put(21,8);
        mydata.put(12,null);
        mydata.put(8,33);
        mydata.put(null,28);
        mydata.put(9,9);
        mydata.put(9,2);

         Iterator it = mydata.entrySet().iterator();
         while(it.hasNext()){
             System.out.println(it.next());
        }

    }
}
