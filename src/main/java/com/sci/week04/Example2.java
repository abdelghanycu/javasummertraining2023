package com.sci.week04;

public class Example2 {

  public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread2());
    t1.start();
    System.out.println("from main");
  }
}


class MyThread2 implements Runnable {

  public void run() {
    System.out.println("Hello thread");
  }
}