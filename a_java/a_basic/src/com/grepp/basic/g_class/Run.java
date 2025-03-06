// 2025.03.06(목)
package com.grepp.basic.g_class;

public class Run {

  public static void main(String[] args) {
    // 레퍼런스 타입 변수(변수 앞에 있는건 타입)
    // 모든 참조형 타입의 데이터들 = 인스턴스

    Coffee coffee = new Coffee(
      "americano",
      1000,
      500,
      10,
      3,
      0,
      'T',
      false
    );


    System.out.println(coffee.type);


  }

}
