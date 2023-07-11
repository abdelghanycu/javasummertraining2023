package com.sci.week04.Test5;

import java.util.concurrent.locks.ReentrantLock;

public class Test5 {

  int count;
  ReentrantLock lock = new ReentrantLock();


  public void inc() {
    lock.lock();
    count++;
    lock.unlock();
  }

  public static void main(String[] args) {
    Test5 x = new Test5();
    x.doWork();
    System.out.println("the value of x = " + x.count);
  }

  public void doWork() {

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 100000; i++) {
          inc();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 100000; i++) {
          inc();
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