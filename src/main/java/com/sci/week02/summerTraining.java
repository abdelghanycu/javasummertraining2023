package com.sci.week02;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class summerTraining {

  public static void main(String[] args) {
    GenericClass<Integer> genericClass = new GenericClass<>();
    genericClass.val = 1;

    GenericClass<StringBuilder> genericClass2 = new GenericClass<>();
    genericClass2.val = new StringBuilder("1");
  }

  public static <E> void printArray(E[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  // take a data structure
  // then add 1 to it
  // add 2 to it
  // remove last element
  // then print it
  public static void doAlotOfThings(List<Integer> list) {
    list.add(1);
    list.add(2);
    list.remove(list.size() - 1);
    System.out.println(list);
  }


  // i want a data structure to behave in a certain way
  // such that the first element to enter to be the last to be removed
  // push , pop , peek , size , isEmpty
  // constant time
  public static void problem1(Stack<Integer> stack) {
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }


  // i want a data structure to behave in a certain way
  // such that the first element to enter to be the first to be removed
  // enqueue , dequeue , top , size , isEmpty
  // constant time
  public static void problem2(Queue<Integer> queue) {
    for (int i = 0; i < 10; i++) {
      queue.add(i);
    }
    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }

  public static int printValueAtIndex(int[] arr, int index) throws MyCheckedCustomException {
    if (index < 0 || index >= arr.length) {
      throw new MyCheckedCustomException("index is invalid");
    }
    return arr[index];
  }

  public static void someMethod(I aaa) {

  }
}

class AAA implements I, Cloneable {

  public void toBeOverriden() {

  }

  public void print(int x) {
    System.out.println(x * 2);
  }

  @Override
  public Object clone() {
    try {
      super.clone();
    } catch (CloneNotSupportedException ex) {
      System.out.println();
    } finally {
      return null;
    }
  }
}

interface I {

  int x = 4;

  void toBeOverriden();

  default void print(int x) {
    System.out.println(x);
  }
}

abstract class AbstractClass1 {

  int x;

  abstract void abstractMethod();
}

class MyCLass1 extends AbstractClass1 {

  @Override
  void abstractMethod() {
    // some impl
  }
}

class MyCLass2 extends AbstractClass1 {

  @Override
  void abstractMethod() {
    // some other impl
  }
}

abstract class Shape {

  abstract double getArea();

  abstract double getPerimeter();
}

class Child extends Object implements I, Cloneable {

  @Override
  public void toBeOverriden() {

  }

  @Override
  public void print(int x) {
    I.super.print(x);
  }
}

interface I1 {

}

interface I2 extends I1 {

}

class MyCheckedCustomException extends Exception {

  public MyCheckedCustomException(String message) {
    super(message);
  }
}

class MyUncheckedCustomException extends RuntimeException {

  public MyUncheckedCustomException(String message) {
    super(message);
  }
}

class GenericClass<E> {

  E val;
}
// OOP
// encapsulation , inheritance , polymorphism

// abstraction
// interface , abstract class

// exceptions handling
// exceptions
// checked and unchecked Exceptions'
// handle exceptions with try n catch n finally

// data structures
// arrays , list (ArrayList, LinkedList), Stack, Queue

// Map , Set , Graph

// generics
