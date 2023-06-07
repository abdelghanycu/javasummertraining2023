package com.sci.week01;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {

//    Student s1 = new Student();
//    System.out.println("here is the second lone to be executed");

//    Student s2 = new Student("abdelghany", 28, "giza", 4, "1245");
//
////    System.out.println(s2.address);
//    System.out.println(s2.getName());
//    s2.print();

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    Student[] std = new Student[n];

    for (int i = 0; i < n; i++) {

      /*
      std[i] = new Student();

      String name = in.next();
      int age = in.nextInt();
      String address = in.next();
      int level = in.nextInt();
      String ssn = in.next();

      std[i].setName(name);
      std[i].setAge(age);
      std[i].setAddress(address);
      std[i].setLevel(level);
      std[i].setSsn(ssn);

       */

      String name = in.next();
      int age = in.nextInt();
      String address = in.next();
      int level = in.nextInt();
      String ssn = in.next();

      std[i] = new Student(name, age, address, level, ssn);
    }

    System.out.println(std[0].value_s);

    std[0].value_s = 15;

    System.out.println("-------------------------");
    System.out.println(std[0].value_s);
    System.out.println(std[1].value_s);
    System.out.println(Student.value_s);

    System.out.println("***********************************");

//    Student.print2(std[0]);
    std[0].print();

    System.out.println(std[0].getName());

    System.out.println("++++++++++++++++++++++++++++++++++++");

    System.out.println(std[0]);
    System.out.println(std[0].toString());
    System.out.println(std[0].getClass().getName() + "@" + Integer.toHexString(std[0].hashCode()));
  }
}

/**
 2
 abdo 5 gize 1 ssn11
 mona 9 cairo 1 ssn55
 */