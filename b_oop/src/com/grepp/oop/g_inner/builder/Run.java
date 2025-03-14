// 2025.03.12 (수)
package com.grepp.oop.g_inner.builder;

public class Run {

  public static void main(String[] args) {
    // 1. 점층적 생성자 패턴
    // 매개변수가 있는 생성자를 사용해 객체를 초기화
    // 단점 : 가독성이 안 좋다.
   // Book book = new Book("차차차", "차은우", 500, false);

    // 2. 자바  Bean 패턴(모든 속성이 getter, setter 모두 있어야함)
    // 기본생성자로 객체를 생성하고 setter를 통해 값을 초기화
    // 모든 권한에 대해 수정권한이 열려 있다. immnutable한 객체를 만들 수 없다.


    // 3. Builder 패턴
    Book book = new Book.Builder()
        .title("해리포터")
        .author("조앤롤링")
        .price(500)
        .activated(false)
        .build();
  }
}
