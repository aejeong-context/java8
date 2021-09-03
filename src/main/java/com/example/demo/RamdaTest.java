package com.example.demo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class RamdaTest {

  public static void main(String[] args) {
    RamdaTest ramdaTest = new RamdaTest();
    ramdaTest.run();
  }
    // final = 어떤 경우에도 변수의 값을 변화시키지 못한다.
  int baseNumber = 10;

  // 받는 파라미터 타입이 모두 같다.
  BinaryOperator<Integer> get10 = (a, b) -> a + b;

  // LocalClass
  class LocalClass {
    void printNumber() {
      int baseNumber = 11;
      System.out.println(baseNumber); // 11
    }
  }

  // 익명 클래스
  Consumer<Integer> consumer =
      new Consumer<Integer>() {
        @Override
        public void accept(Integer baseNumber) {
          System.out.println(baseNumber); // 파라미터를 사용한다.
        }
      };



    private void run(){

        // 람다
        IntConsumer printInt = (a) -> System.out.println(a);
        printInt.accept(10);
    }



  // 모두 baseNumber(final 변수) 를 참조할 수 있다.
}
