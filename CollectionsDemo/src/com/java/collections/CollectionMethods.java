package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionMethods {

  public static void main(String args[]) {

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(12);
    list1.add(43);
    list1.add(15);
    list1.add(67);
    list1.add(10);

    ArrayList<Integer> newList = new ArrayList<Integer>();
    // newList.add(10);
    newList.add(67);
    newList.add(15);

    // list1.addAll(newList);  //[12, 43, 15, 67, 10]
    // list1.removeAll(newList); //[12, 43, 15, 67]
    // list1.clear(); //[]
    // System.out.println("List contains newList: " + list1.contains(newList));
    // System.out.println("List contains 67: " + list1.contains(67)); //true
    // System.out.println("List Empty: " + list1.isEmpty()); //false
    // list1.retainAll(newList); [15, 67]
    System.out.println(list1);

    HashSet<Integer> list2 = new HashSet<Integer>();
    list2.add(12);
    list2.add(43);
    list2.add(15);
    list2.add(67);
    list2.add(10);

    List<Integer> list = new ArrayList<Integer>(list2);
    Collections.sort(list);
    System.out.println(list);
  }
}
