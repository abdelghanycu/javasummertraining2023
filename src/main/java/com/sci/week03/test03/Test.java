package com.sci.week03.test03;

public class Test {

  public static void main(String[] args) {
//    int x[] = {1, 2, 3, 4};
//    System.out.println(sumArray(x, 0));
//    System.out.println(fact(4));


    BinarySearchTree tree = new BinarySearchTree();
    tree.add(9);
    tree.add(7);
    tree.add(8);
    tree.add(12);
    tree.add(11);

    System.out.println("*******************IN******************");
    tree.printIn();
    System.out.println("********************PRE*****************");
    tree.printPre();
    System.out.println("*******************POST******************");
    tree.printPost();
  }

  public static int sumArray(int arr[], int cursor) {
    if (cursor == arr.length) {
      return 0;
    }
    return arr[cursor] + sumArray(arr, cursor + 1);
  }

  public static int fact(int x) {
    if (x == 0 || x == 1) {
      return 1;
    }
    return x * fact(x - 1);
  }
}
