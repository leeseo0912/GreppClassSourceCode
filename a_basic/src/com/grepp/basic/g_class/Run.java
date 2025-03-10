// 2025.03.06(목)
// 2025.03.07(금)
package com.grepp.basic.g_class;

public class Run {

  public static void main(String[] args) {
    //init();
    classMember();
  }

  private static void classMember() {
    // type 에 속한다. -> 인스턴스를 생성하지 않고 타입정보만으로 사용할 수 있다.
    System.out.println(Coffee.type);
    //Coffee.info();

    Coffee.type = 'F';
    Coffee americano = new Coffee("아메리카노");
    Coffee mocha = new Coffee("모카");

    System.out.println(americano.type);
    System.out.println(mocha.type);
    mocha.info();
  }

  private static void init() {
    Coffee coffee = new Coffee(
      "americano",
      1000,
      500,
      10,
      3,
      0,
      false
    );

    System.out.println(coffee.name);
    System.out.println(coffee.price);
    System.out.println(coffee.type);

    coffee.type = 'Q';
    System.out.println(coffee.type);
  }

}
