package com.sci.week01;

public class Person {

  protected String name;
  protected int age;
  protected String address;

  public Person() {
    System.out.println("here is the first line to be executed in the person class without params");
  }

  public Person(String name, int age, String address) {
    System.out.println("here is the first line to be executed in the person class with params");
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public final void m1() {
    System.out.println("dfghjkl");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }
}
