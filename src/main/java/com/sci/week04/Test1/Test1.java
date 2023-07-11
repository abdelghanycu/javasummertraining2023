package com.sci.week04.Test1;

public class Test1 {

  int count = 0;

  public static void main(String[] args) {
    Test1 x = new Test1();
    x.doWork();
    System.out.println("the value of x = " + x.count);
  }

  public void doWork() {

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 100000; i++) {
          count++;
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 100000; i++) {
          count++;
        }
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }
}
