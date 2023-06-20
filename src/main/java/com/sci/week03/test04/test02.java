package com.sci.week03.test04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class test02 {

  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new TreeSet<>();

    s1.add(5);
    s1.add(5);
    s1.add(5);
    s1.add(5);
    s1.add(5);
    s1.add(6);

    System.out.println(s1.size());
    System.out.println(s1.contains(5));
    System.out.println(s1.contains(7));

    for(int x : s1) {
      System.out.println(x);
    }

    System.out.println("***************************************");

    Map<String, Double> m1 = new HashMap<>();
    Map<String, Double> m2 = new TreeMap<>();

    m2.put("abdo", 15.5);
    m2.put("abdo", 17.5);
    m2.put("mona", 17.5);
    m2.put("ahmed", 17.5);
    m2.put("islam", 17.5);


    m1.put("abdo", 17.5);
    m1.put("mona", 17.5);
    m1.put("ahmed", 17.5);
    m1.put("islam", 17.5);

    System.out.println(m2.size());

    for(Map.Entry<String, Double> entry : m2.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    System.out.println("*****************");

    for(Map.Entry<String, Double> entry : m1.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
