// 2025.03.07 (금)
package com.grepp.oop.c_encapsulation;

// NOTE CCoffee 01 : 캡슐화
// 모든 속성은 private 선언해 클래스 외부와 내부를 구분
// getter/setter
// getter : 속성에 저장한 값을 클래스 외부로 전달
// setter : 속성에 들어갈 값에 대한 검증(validate)

// 클래스 속성에 대한 권한관림
// getter/setter : 속성에 대한 읽고 쓰기 권한
// getter        : 속성에 대한 읽기 권한
//               : 속성을 숨김


public class Coffee {

  // private 외부 class에서 접근 할 수 없음
  private String name;
  private int price;
  private int cost;
  private int stock;
  private int safetyStock;
  private int salesCnt;

  // 기본 생성자 : 외부에서 접근을 할 수 있게
  public Coffee() {

  }

  // getter: 우리 객체에 있는걸 다른곳으로 반환하기 위해
  // setter: 우리 객체에 어떤값을 변경하기 위해

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    if(cost < 0) return;
    this.price = price;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public int getSafetyStock() {
    return safetyStock;
  }

  public void setSafetyStock(int safetyStock) {
    this.safetyStock = safetyStock;
  }

  public int getSalesCnt() {
    return salesCnt;
  }

  public void setSalesCnt(int salesCnt) {
    this.salesCnt = salesCnt;
  }

}
