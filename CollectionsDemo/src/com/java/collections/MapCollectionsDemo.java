package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollectionsDemo {

  public static void main(String[] args) {

    TreeMap<String, String> dictionary = new TreeMap<String, String>();
    dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
    dictionary.put("Brilliant", "exceptionally clever or talented");
    dictionary.put("Joy", "a feeling of great pleasure and happiness");
    dictionary.put("Confidence", "the state of feeling certain about the truth of something");

//    for(String word: dictionary.keySet()) {
//      System.out.println(word + " : " + dictionary.get(word));
//    }

    for(Map.Entry<String, String> entry :  dictionary.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }

  }

}
