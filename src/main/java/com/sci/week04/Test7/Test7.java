package com.sci.week04.Test7;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test7 {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    Future<Integer> v1 = executorService.submit(new Callable<Integer>() {
      public Integer call() {
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        return (int) (Math.random() * 100);
      }
    });

    executorService.shutdown();

    System.out.println("Before getting the value of the integer");
    try {
      System.out.println(v1.get());
    } catch (Exception e) {
    }
    System.out.println("After getting the value of the integer");

    try {
      executorService.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("End of the main method");
  }
}
