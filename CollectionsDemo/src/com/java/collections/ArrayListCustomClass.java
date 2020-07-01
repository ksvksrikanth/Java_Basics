package com.java.collections;

import java.util.ArrayList;

public class ArrayListCustomClass {

  public static void main(String args[]) {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Vehicle("Honda", "Accord", 1200000, true));

    Vehicle vehicle = new Vehicle("Honda", "Activa", 55000, false);
    vehicles.add(vehicle);
    vehicles.add(new Vehicle("Maruthi", "Wagonar", 600000, true));
    vehicles.add(new Vehicle("TVS    ", "Jupiter", 54000, false));

    System.out.println("Make\tModel\tPrice\tFourWheeler");
    System.out.println("------------------------------------------");
    for (Vehicle vehDetails : vehicles) {
      System.out.println(vehDetails);
    }
  }
}
