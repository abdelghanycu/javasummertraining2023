package com.sci.week01;

public class Student extends Person {

  public static int value_s = 6;

  int level;
  String ssn;

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Student() {
    System.out.println("here is the first line to be executed in the student class");
  }

  public Student(String name, int age, String address, int level, String ssn) {
    super(name, age, address);
    this.level = level;
    this.ssn = ssn;
  }

  void print() {
//    System.out.println("name = " + this.name + " age = " + age + " address = " + address);
    print2(this);
  }

  static void print2(Student s) {
    System.out.println("name = " + s.getName() + " age = " + s.getAge() + " address = " + s.address);
    s.setName("abdelghany");
  }

  @Override
  public String toString() {
    return "Student{" +
        "level=" + level +
        ", ssn='" + ssn + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }

//  @Override
//  public void m1() {
//    System.out.println("dfghjkl;");
//  }

  @Override
  public boolean equals(Object obj) {
    Student s = (Student) obj;
    return 5 > 3;
//    return (this.level == s.level);
  }


}
