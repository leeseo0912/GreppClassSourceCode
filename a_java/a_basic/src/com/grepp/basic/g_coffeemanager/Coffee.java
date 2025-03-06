// 2025.03.06(목)
package com.grepp.basic.g_coffeemanager;

public class Coffee {
  String name;
  int price;
  int cost;
  int stock;
  int safetyStock;
  int salesCnt;

  // this :  인스턴스의 주소를 가지고 있는 참조형 변수
  public Coffee(String name, int price, int cost, int stock, int safetyStock, int salesCnt) {
    this.name = name;
    this.price = price;
    this.cost = cost;
    this.stock = stock;
    this.safetyStock = safetyStock;
    this.salesCnt = salesCnt;
  }
}
