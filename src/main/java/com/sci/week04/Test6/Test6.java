package com.sci.week04.Test6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test6 {

  public static void main(String[] args) throws InterruptedException {
//    Semaphore semaphore = new Semaphore(5);
//
//    semaphore.acquire();
//    semaphore.acquire();
//    semaphore.acquire();
//    semaphore.acquire();
//    semaphore.acquire();
//    System.out.println("before 17");
//    semaphore.acquire();
//    System.out.println("after 17");
//
//    semaphore.release();
//
//    System.out.println(semaphore.availablePermits());

    ExecutorService executorService = Executors.newFixedThreadPool(200);

    for(int i = 0; i < 50; i++) {
      int finalI = i;
      executorService.submit(new Runnable() {
        @Override
        public void run() {
          try {
            new DatabaseConnection(finalI).connect();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      });
    }

    executorService.shutdown();

    try {
      executorService.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("End of the main method");
  }
}


class DatabaseConnection {

  int id;

  private static Semaphore semaphore = new Semaphore(5);

  DatabaseConnection(int id) {
    this.id = id;
  }

  public void connect() throws InterruptedException {

    semaphore.acquire();

    System.out.println("here executing the database query for the process " + id);

    Thread.sleep(5000);

    System.out.println("finish executing the database query for the process " + id);

    semaphore.release();

  }

}