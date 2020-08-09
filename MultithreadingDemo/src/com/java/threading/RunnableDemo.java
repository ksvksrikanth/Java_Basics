package com.java.threading;

public class RunnableDemo {
  public static void main(String[] args) {
    RunnableTask taskRunner = new RunnableTask("Thread A");
    Thread t1 = new Thread(taskRunner);
    t1.start();

    RunnableTask taskRunner1 = new RunnableTask("Thread B");
    Thread t2 = new Thread(taskRunner1);
    t2.start();
  }
}

class RunnableTask implements Runnable {
  String name;

  public RunnableTask(String name) {
    this.name = name;
  }

  public void run() {
    Thread.currentThread().setName(this.name);
    for (int i = 0; i < 100; i++) {
      System.out.println("number - " + i + " - " + Thread.currentThread().getName());
      //      try {
      //        Thread.sleep(1000);
      //      } catch (InterruptedException e) {
      //        e.printStackTrace();
      //      }
    }
  }
}
