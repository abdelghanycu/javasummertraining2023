package com.sci.week04;

public class Example1 {

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new MyThread();
    Thread t2 = new MyThread();


    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("from main");
  }
}

class MyThread extends Thread {

  public void run() {
    System.out.println("Hello thread");
  }
}
