package com.grepp.oop.c_encapsulation;

public class Run {

  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    //private로 막아서 직접 접근 x
    //System.out.println(coffee.name);
    //getter 이용해서 값 가져오기
    System.out.println(coffee.getPrice());
    //setter 이용해서 값 넣어줌
    coffee.setName("아메리카노");
    System.out.println(coffee.getName());


  }

}
