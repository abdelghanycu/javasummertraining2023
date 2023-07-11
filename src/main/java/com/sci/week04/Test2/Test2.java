package com.sci.week04.Test2;

public class Test2 {

  int count = 0;
  int MAX_VALUE = 1000000;


  public void incr() {
    synchronized (this) {
      count++;
    }
  }

  public static void main(String[] args) {
    Test2 x = new Test2();
    x.doWork();
    System.out.println("the value of the count = " + x.count);
  }

  private void doWork() {

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < MAX_VALUE; i++) {
          incr();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < MAX_VALUE; i++) {
          incr();
        }
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
    }

  }
}
