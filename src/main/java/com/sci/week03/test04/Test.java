package com.sci.week03.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    List<String> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(in.next());
    }

    System.out.println("end of reading");

    int q = in.nextInt();
    while (q-- > 0) {
      String name = in.next();
      boolean flag = false;
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals(name)) {
          flag = true;
          break;
        }
      }
      System.out.println(flag ? "YES" : "NO");
    }
  }
}
