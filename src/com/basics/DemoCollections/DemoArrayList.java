package com.basics.DemoCollections;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String args[]){
      List<Integer> mydata = new ArrayList<Integer>();
      mydata.add(3);
      mydata.add(45);
      mydata.add(2);
      mydata.add(null);
      mydata.add(2);
      mydata.add(19);
      for(int i=0;i<mydata.size();i++){
          System.out.print(" "+mydata.get(i)+"");
      }
    }
}
