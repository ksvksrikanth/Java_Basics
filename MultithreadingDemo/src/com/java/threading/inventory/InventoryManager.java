package com.java.threading.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

  List<Product> soldProductsList = new CopyOnWriteArrayList<Product>();
  List<Product> purchasedProductsList = new ArrayList<Product>();

  public void populateSoldProducts() {
    for (int i = 1; i <= 500; i++) {
      Product prod = new Product(i, "test_product_" + i);
      soldProductsList.add(prod);
      System.out.println("ADDED : " + prod);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void displaySoldProducts() {
    for (Product product : soldProductsList) {
      System.out.println("PRINTING THE SOLD: " + product);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
