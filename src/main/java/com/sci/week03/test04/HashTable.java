package com.sci.week03.test04;

public class HashTable {

  String[] arr;
  int sz = (int) 1e5 + 9;

  HashTable() {
    arr = new String[sz];
  }

  public void add(String key) {
    arr[hash(key)] = key;
  }

  public boolean isExist(String key) {
    return arr[hash(key)] != null;
  }

  public int hash(String key) {
    int res = 0;
    for (int i = 0; i < key.length(); i++) {
      res = (res + (key.charAt(i) - 'a') * (i + 1)) % sz;
    }
    return res;
  }

}
