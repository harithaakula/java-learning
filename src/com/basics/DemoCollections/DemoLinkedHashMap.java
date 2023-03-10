package com.basics.DemoCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
    public static void main(String[] args) {

         Map<Integer,Integer> mydata = new LinkedHashMap<Integer,Integer>();


        mydata.put(9,21);
        mydata.put(null,21);
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
