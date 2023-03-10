package com.basics.DemoCollections;

import java.util.LinkedList;
import java.util.List;
public class DemoLinkedList {
    public static void main(String args[]){
        List<Integer>mydata=new LinkedList<Integer>();
        mydata.add(3);
        mydata.add(null);
        mydata.add(2);
        mydata.add(3);
        mydata.add(12);
        mydata.add(43);
for(int i=0;i<mydata.size();i++){
    System.out.println(" "+mydata.get(i)+"");
}
    }
}
