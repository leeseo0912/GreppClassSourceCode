// 2025.03.12 (수)
package com.grepp.oop.g_inner;

public class A_OuterClass {
    private String desc;

  public A_OuterClass(String desc) {
    this.desc = desc;
  }

  // NOTE GA04 익명클래스
  // 클래스나 인터페이스의 이름이 없는 자식 클래스를 생성과 동시에 인스턴스화 하고 싶을 때 사용
  // 이름(타입)이 없어서 인스턴스를 다룰수 없다.
  // 특정 메소드를 한번 오버라이드 하고 싶을때 사용
  // 자주 사용
  public void anonymous(){
    AnonymousAbstractClass anonymous = new AnonymousAbstractClass(){
      @Override
      public void print() {
        System.out.println("annomymous");
      }
    };
    anonymous.print();
  }



  // NOTE GA03 Local class
  // 클래스를 선언한 메소드 안에서만 사용 가능
  public void localClass(){
    class LocalClass {
      public void print(){
        System.out.println("=================================");
        System.out.println("LocalClass");
        System.out.println(this);
      }
    }
    LocalClass local = new LocalClass();
    local.print();
  }

  // NOTE A01 Static Inner Class
  public static class StaticInner{
    public void print() {
      System.out.println("=================================");
      System.out.println("Static Inner Class 입니다.");
      // 객체의 필드에는 접근 못함
    }
  }

  // NOTE A02 Instanc Inner Class
  public class InstanceInner{
    public void print(){
      System.out.println("=================================");
      System.out.println(A_OuterClass.this);
      System.out.println(this);
      System.out.println(desc);
    }
  }
}
