package com.example.demo;

public class TestMain {
  public static void main(String[] args) {
    final int number =3 ;
    System.out.println("hello");
    TestInterface testInterface =
        () -> {
          System.out.println("call of the ");
          return number + 3;
        };

    System.out.println(testInterface.plus());
    System.out.println(TestInterface.info());
  }
}
