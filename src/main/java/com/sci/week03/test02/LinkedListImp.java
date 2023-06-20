package com.sci.week03.test02;

public class LinkedListImp {

  Node head;
  Node tail;
  int sz;

  public void add(int ele) {
    Node newNode = new Node(ele, null);

    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    sz++;
  }
  
  public boolean search(int ele) {
    Node cur = head;
    while (cur != null) {
      if(ele == cur.data) return true;
      cur = cur.next;
    }
    return false;
  }

  public static void main(String[] args) {
    LinkedListImp x = new LinkedListImp();
    x.add(5);
    x.add(6);
    x.add(7);
    x.add(8);

    System.out.println(x.search(9));
    System.out.println(x.search(7));
  }
}
