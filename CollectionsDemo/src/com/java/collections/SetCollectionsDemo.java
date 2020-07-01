package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetCollectionsDemo {
  public static void main(String args[]) {

    HashSet<Integer> values = new HashSet<Integer>();
    values.add(23);
    values.add(12);
    values.add(43);
    values.add(32);
    values.add(23);

    for (Integer value : values) System.out.println(value);

    HashSet<String> names = new HashSet<String>();
    names.add("James");
    names.add("Goldie");
    names.add("Vikram");
    names.add("James");
    names.add("Smith");

    for (String name : names) System.out.println(name);

    LinkedHashSet<String> names1 = new LinkedHashSet<String>();
    names1.add("James");
    names1.add("Goldie");
    names1.add("Vikram");
    names1.add("James");
    names1.add("Smith");

    for (String name : names1) System.out.println(name);

    HashSet<Animal> animals = new HashSet<Animal>();
    Animal animal1 = new Animal("Dog", 12);
    Animal animal2 = new Animal("Cat", 8);
    Animal animal3 = new Animal("Bird", 3);
    Animal animal4 = new Animal("Dog", 12);
    Animal animal5 = new Animal("Kangaroo", 24);

    animals.add(animal1);
    animals.add(animal2);
    animals.add(animal3);
    animals.add(animal4);
    animals.add(animal5);

    for (Animal animal : animals) System.out.println(animal);
  }
}
