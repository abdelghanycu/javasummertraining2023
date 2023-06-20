package com.sci.week03.test04;

import java.util.Scanner;

public class TestHashTable {

  public static void main(String[] args) {
    HashTable x = new HashTable();

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      x.add(in.next());
    }

    System.out.println("end of reading");

    int q = in.nextInt();
    while (q-- > 0) {
      String name = in.next();
      System.out.println(x.isExist(name) ? "YES" : "NO");
    }
  }
}
