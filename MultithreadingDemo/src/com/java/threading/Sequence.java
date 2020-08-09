package com.java.threading;

public class Sequence {

  private int value = 0;

  public synchronized int getNext() {
//    synchronized (this) {
//      value++;
//      return value;
//    }
      value++;
      return value;
  }
}
