package com.example.demo;

import java.util.function.*;

public class TestMain {
  public static void main(String[] args) {

    // Function<parameter,return> - 파라미터 , 리턴값 존재하는 함수 입력값 1개
    Function<Integer, Integer> plus10 = (i) -> i + 10;
    Function<Integer, Integer> multi10 = (i) -> i * 10;

    // 20
    System.out.println(plus10.apply(10));
    // andThen -> plus10 연산후에 multi 연산. 10 + 10 * 10
    System.out.println(plus10.andThen(multi10).apply(10));
    // compose -> 파라미터로 받은 multi10를 먼저 계산후 plush10 연산 10 * 5 + 10
    System.out.println(plus10.compose(multi10).apply(5));

    // 파라미터 1개를 받아 출력하는 함수
    Consumer<Integer> printT = System.out::println;
    printT.accept(3);

    // 받아올 파라미터의 타입을 정해준다
    Supplier<Integer> get10 = ()-> 10; // 무조건 10을 return 하는 함수

    // 어떠한 인자값을 1개 받아서 t/f를 return 해주는 함수
    Predicate<String> stringPredicate = (a)-> a.startsWith("aejeong");
    Predicate<String> stringPredicate1 = (b)-> b.startsWith("jisu");

    boolean test =  stringPredicate.or(stringPredicate1).test("cong");
    System.out.println(test);

    // 입력값,리턴값의 타입이 같을 경우 사용하는 함수
    // Integer 로 받아 Integer 로 return 한다.
    UnaryOperator<Integer> operator = (i)->i+1;


  }

}
