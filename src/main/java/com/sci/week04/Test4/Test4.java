package com.sci.week04.Test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test4 {

  public static void main(String[] args) throws InterruptedException {
//    ExecutorService executorService = Executors.newFixedThreadPool(3);
    ExecutorService executorService = Executors.newWorkStealingPool();
    for(int i = 0; i < 10; i++) {
      executorService.submit(new Process(i));
    }
    executorService.shutdown();
//    while(!executorService.isTerminated()) {
//      Thread.sleep(500);
//    }
    try {
      executorService.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("End of the main method");
  }
}

class Process implements Runnable {

  int id;

  Process(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println("Starting of the thread " + id);
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("ending of the thread " + id);
  }
}