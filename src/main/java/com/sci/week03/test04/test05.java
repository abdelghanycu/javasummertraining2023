package com.sci.week03.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class test05 {

  static Vector<Integer> vec = new Vector<>();
  static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) {

    m1();
    m2();
    m3();
    m4();
  }

  public static void m1() {
    vec.add(5);
    list.add(5);
  }

  public static void m2() {
    vec.add(6);
    list.add(6);
  }

  public static void m3() {
    vec.add(7);
    list.add(7);
  }

  public static void m4() {
    vec.add(8);
    list.add(8);
  }

}
