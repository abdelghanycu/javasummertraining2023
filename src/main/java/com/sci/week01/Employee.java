package com.sci.week01;

public class Employee extends Person {

  private int salary;


  public Employee() {
  }

  public Employee(String name, int age, String address, int salary) {
    super(name, age, address);
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "salary=" + salary +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }
}
