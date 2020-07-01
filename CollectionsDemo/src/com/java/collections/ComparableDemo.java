package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ComparableDemo {
  public static void main(String[] args) {
    HashSet<Employee> hashSet = new HashSet<Employee>();
    hashSet.add(new Employee("A", "Accounting", 15000));
    hashSet.add(new Employee("B", "Admin", 14000));
    hashSet.add(new Employee("C", "IT", 25000));
    hashSet.add(new Employee("D", "Maintenance", 5000));

    List<Employee> empList = new ArrayList<Employee>(hashSet);
    Collections.sort(empList);

    System.out.println(empList);
  }
}
