package com.example.demo;


public class EnumController {

  public static void main(String[] args) {

    System.out.println(ItemType.AA.getRatio().apply(120L));
    System.out.println(ItemType.AA.totalAccount.apply(250,5));

  }
}
