package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

  public static void main(String args[]) {

    ArrayList words = new ArrayList();
    words.add("Hello");
    words.add("Krishna");
    words.remove(0);
    words.add(10);
    words.add(9);
    words.add(12.00);
    words.add('H');

    String item1 = (String) words.get(0);
    int item2 = (int) words.get(1);
    int item3 = (int) words.get(2);
    System.out.println(item1);
    System.out.println(item2 + item3);

    ArrayList<String> words_str = new ArrayList<String>();
    words_str.add("hello");
    words_str.add("world");
    words_str.add("10");

    String word1 = words_str.get(2);
    System.out.println(word1);

    // Traversing the List
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("lion");
    animals.add("tiger");
    animals.add("dog");
    animals.add("cat");

    for (int i = 0; i < animals.size(); i++) System.out.println(animals.get(i));

    for (String animal : animals) System.out.println(animal);

    Collections.sort(animals);
    System.out.println(animals);
  }
}
