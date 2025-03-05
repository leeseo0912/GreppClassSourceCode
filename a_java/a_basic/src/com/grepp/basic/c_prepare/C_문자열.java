package com.grepp.basic.c_prepare;

// 2025.03.05(수)
public class C_문자열 {

  // NOTE CC01 String
  // 참조형 타입 : primitive type을 제외한 모든 타입
  // new 연산자 : heap 영역에 데이터를 저장할 공간을 할당 받고, 주소를 변수에 연결해주는 연산자
  // 타입 변수명 = new  생성자 호출
  // @@ stack 영역 : 크기가 정확히 정해진 것만 할당, heap영역을 찾아가기 위한 시작주소를 가지고 있음 4byte
  // @@ heap 영역 : 크기가 정해지지 않은 것 할당
  //

  public static void main(String[] args) {
      String hello = new String("hello world");
      String hi = new String("hello world");

      // 문자열 대강 주소 알아보는 방법
      System.out.println(System.identityHashCode(hello));
      System.out.println(System.identityHashCode(hi));

      // @@ 비교연산자는 stack영역에 있는 값으로 비교함
      System.out.println(hello == hi); // @@스택영역에 있는 객체의 주소가 달라서 false

      // 모든 참조형 변수는 등위비교를 할 때, equals() 메서드로 비교해야 한다.
      System.out.println(hello.equals(hi)); // true

      System.out.println("=== literal 초기화 ===");
      String a = "hello world";
      String b = "hello world";
      System.out.println(System.identityHashCode(a));
      System.out.println(System.identityHashCode(b));
      // System.out.println(a == b); // @@ true - 주소를 비교(둘 다 stack 영역이라 true) = 사용하지 말자
      System.out.println(a.equals(b)); // @@ true - 문자열 자체를 비교

  }

}
