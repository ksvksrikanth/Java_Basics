package com.java.collections;

public class Vehicle {
  String make;
  String model;
  int price;
  boolean fourWheeler;

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isFourWheeler() {
    return fourWheeler;
  }

  public void setFourWheeler(boolean fourWheeler) {
    this.fourWheeler = fourWheeler;
  }

  public Vehicle(String make, String model, int price, boolean fourWheeler) {
    this.make = make;
    this.model = model;
    this.price = price;
    this.fourWheeler = fourWheeler;
  }

  @Override
  public String toString() {
    return make + "\t" + model + "\t" + price + "\t" + (fourWheeler ? "Yes" : "No");
  }
}
