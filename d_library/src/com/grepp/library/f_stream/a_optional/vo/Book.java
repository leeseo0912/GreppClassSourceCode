// 2025.03.14 (금)
package com.grepp.library.f_stream.a_optional.vo;

// NOTE E01 Record
// 도메인 객체 : 역할과 책임으 가지고 있는 객체
// 데이터 객체 : 데이터를 전송이나 저장을 위한 객체
//     DTO : Data Transfer Object (mutable, setter가 다 열려있다.)
//      VO : Value Object (immutable, 수정되면 안되는 객체)

// record == vo
// 불변 데이터 클래스 (필드는 private final - 상수, 불변객체이기 때문)
// 속성명으로 getter가 자동 생성 getTitle(x), title(o)
// equals, hashcode, toString 자동 overriding
// 데이터 객체를 편하게 쓰기 위해 등장


public record Book(String title,
                   String author,
                   Integer price,
                   Boolean activate
) {

  //Non-canonical record constructor must delegate to another constructo
  public Book(){
    this("","",null,null);
  }

  //Non-canonical record constructor must delegate to another constructo
//  public Book(Integer price){
//    this("","",price,null);
//  }

//  public void modifyTitle(String title){
//    //Cannot assign a value to final variable 'title'
//    this.title = title;
//  }

}
