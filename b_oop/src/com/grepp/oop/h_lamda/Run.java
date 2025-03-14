// 2025.03.14 (금)
package com.grepp.oop.h_lamda;

import com.grepp.oop.h_lamda.domain.Exam;
import com.grepp.oop.h_lamda.function.Consumer;

public class Run {

  public static void main(String[] args) {

    // NOTE H01 Lambda
    // 1. 매개변수의 타입은 생략한다. -> 인터페이스에 이미 정의를 해놓음
    // 2. 매개변수가 하나라면 매개변수 선언부의 괄호는 생략한다.
    //    ex) () -> {}, (a,b) -> {}, a -> {}
    // 3. 코드블록의 코드가 한 줄인 경우 {} 생략 할 수 있다.
    //    ex) () -> System.out.println("hi");
    // 4. 반환문만 존재하는 함수라면 {}과 return을 함께 생략할 수 있다.

    _Lambda lambda = new _Lambda();
    // 익명 클래스
//    lambda.testConsumer(new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        System.out.println(s);
//        System.out.println(s);
//      }
//    });

    // 위에 꺼랑 같은거임
    // 익명 함수임
    lambda.testConsumer( a -> {
      System.out.println(a);
      System.out.println("===================");
    });

    lambda.testSupplier(() -> " : 공급받은 문자열");

    System.out.println("====================");

    lambda.testPredicate(num -> {
      System.out.println(num + "의 홀짝 여부 판단");
      return num % 2 == 0;
    });

    System.out.println("====================");

    lambda.testFunction((a, b) -> a + b);

    Exam kor = new Exam("국어", "이서", 70);
    Exam math = new Exam("수학", "이서", 70);

    System.out.println("국어시험 통과했니?");
    System.out.println(kor.isPass(exam -> exam.getScore() >= 80));
    System.out.println("수학시험 통과했니?");
    System.out.println(math.isPass(exam -> exam.getScore() >= 60));

    // 메서드 참조
    // 함수형 인터페이스의 추상메서드 선언부(반환타입, 매개변수 목록)와 일치하는
    // 다른 클래스의 메서드라면 메서드 참조형식으로 사용할 수 있다.
    // Class Name :: 메서드명 => static 메서드, 임의 인스턴스 메서드
    // 참조변수 :: 메서드명 => 인스턴스 메서드 호출
    // Class Name :: new => 생성자 호출

    // 아래 두개는 똑같음
    // lambda.testConsumer(a -> System.out.println(a));
    lambda.testConsumer(System.out::println);
    lambda.testSupplier(String::new);


  }
}
