package com.sci.week03.test03;

public class BinarySearchTree {

  Node root;

  public void add(int val) {
    if (root == null) {
      root = new Node(val, null, null);
    } else {
      add(val, root);
    }
  }

  public void add(int val, Node current) {
    if (val == current.val) {
      return;
    } else if (val < current.val) {
      if (current.left == null) {
        current.left = new Node(val, null, null);
      } else {
        add(val, current.left);
      }
    } else {
      if (current.right == null) {
        current.right = new Node(val, null, null);
      } else {
        add(val, current.right);
      }
    }
  }

  public void printIn() {
    printIn(root);
  }

  private void printIn(Node curr) {
    if(curr == null) {
      return;
    }
    printIn(curr.left);
    System.out.println(curr.val);
    printIn(curr.right);
  }


  public void printPre() {
    printPre(root);
  }

  private void printPre(Node curr) {
    if(curr == null) {
      return;
    }
    System.out.println(curr.val);
    printPre(curr.left);
    printPre(curr.right);
  }

  public void printPost() {
    printPost(root);
  }

  private void printPost(Node curr) {
    if(curr == null) {
      return;
    }
    printPost(curr.left);
    printPost(curr.right);
    System.out.println(curr.val);
  }

}
