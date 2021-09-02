package com.example.demo;

// 한가지의 메서드만 허용
@FunctionalInterface
public interface TestInterface {
    int plus();

    // static 메서드 사용 가능
    static String info(){
        return "Hi";
    }
}
