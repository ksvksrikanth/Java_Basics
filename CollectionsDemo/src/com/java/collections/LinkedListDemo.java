package com.java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String args[]) {

    LinkedList<Integer> numbers = new LinkedList<Integer>();
    numbers.add(1);

    for (int i = numbers.get(0) + 1; i < 5; i++) numbers.add(i);

    numbers.stream().forEach(System.out::println);
    numbers.removeFirst();
    System.out.println("----------------------------");
    for (int number : numbers) System.out.println(number * 10);
  }
}
