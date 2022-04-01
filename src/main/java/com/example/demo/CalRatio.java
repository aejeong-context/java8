package com.example.demo;

public class CalRatio {

  public static Integer getRatio(Long weight) {

    double totalWeight = 300;

    return (int) Math.round(weight / totalWeight * 100);
  }

  public static Integer getTotalAccount(int quantity, int unit) {

    return Math.round(quantity * unit);
  }

}
