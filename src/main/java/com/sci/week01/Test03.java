package com.sci.week01;

public class Test03 {

  public static void main(String[] args) {

    Person p1 = new Employee("abdelghany", 28, "Giza", 45);

    System.out.println(p1.toString());
    if (p1 instanceof Employee) {
      System.out.println(((Employee) p1).toString());
    }

    System.out.println("**********************************");

    Person p2 = new Student("mona", 25, "Cairo", 4, "ssn15");
    Person p3 = new Student("mona", 25, "Cairo", 4, "ssn15");

//    Person p3 = new Student("ahmwed", 30, "Cairo", 4, "ssn77");

    System.out.println(p2.equals(p3));

//    Math ob = new Math();

    System.out.println(Math.max(5, 7));
  }
}
