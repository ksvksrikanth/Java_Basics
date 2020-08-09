package com.java.threading;

public class ThreadDemo {
  public static void main(String[] args) {

    System.out.println("Starting Thread 1...");
    Task taskRunner = new Task("Thread A");
    taskRunner.start();

    System.out.println("Starting Thread 2...");
    Task taskRunner1 = new Task("Thread B");
    taskRunner1.start();
  }
}

class Task extends Thread {
  String name;

  public Task(String name) {
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
