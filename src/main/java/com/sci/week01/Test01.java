package com.sci.week01;

import java.util.Scanner;

public class Test01 extends Object {

  public static void main(String[] args) {
    // name age level address ssn ....
    // 20
    int n = 2;
    String[] names = new String[n];
    int[] ages = new int[n];
    int[] levels = new int[n];
    String[] addresses = new String[n];
    String[] ssn = new String[n];

    Scanner in = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      names[i] = in.next();
      ages[i] = in.nextInt();
      levels[i] = in.nextInt();
      addresses[i] = in.next();
      ssn[i] = in.next();
    }


  }
}
