package com.java.collections;

public class Employee implements Comparable<Employee> {
  String name;
  String department;
  int salary;

  public Employee(String name, String department, int salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee o) {
    if (this.salary < o.salary) {
      return -1;
    } else if (this.salary > o.salary) {
      return 1;
    } else return 0;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            '}';
  }
}
