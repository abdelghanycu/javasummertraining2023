package com.sci.week04.Test3;

public class Test3 {

  public static void main(String[] args) {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        while (true){
          if(5 < 3) {
            break;
          }
        }
        System.out.println("fghjk");
      }
    });

    t1.start();

    System.out.println("Thread main before sleep");

    try {
      Thread.sleep(500);
    }catch (Exception ex) {

    }

    System.out.println("Thread main here after sleep");

    t1.interrupt();


//    try {
//      t1.join();
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    System.out.println("end of the main method");
  }
}
