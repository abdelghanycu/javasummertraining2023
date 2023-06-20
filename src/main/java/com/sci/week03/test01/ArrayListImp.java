package com.sci.week03.test01;

public class ArrayListImp {

  int[] arr;
  int cap;
  int sz;

  public ArrayListImp() {
    cap = 2;
    arr = new int[cap];
    sz = 0;
  }

  public int get(int index) {
    return arr[index];
  }

  public void add(int ele) {
    if(sz == arr.length) {
      copy();
    }
    arr[sz] = ele;
    sz++;
  }

  public int size() {
    return sz;
  }

  public void copy() {
    cap = arr.length * 2;
    int[] newArr = new int[cap];
    for(int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    arr = newArr;
  }
}
