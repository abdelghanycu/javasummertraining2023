package com.sci.week04;

public class Example3 {

  public static void main(String[] args) {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("hello thread");
      }
    });
    t1.start();
  }
}
