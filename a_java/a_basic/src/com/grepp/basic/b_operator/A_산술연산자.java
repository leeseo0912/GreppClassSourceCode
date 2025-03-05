// 2025.03.05(수)
package com.grepp.basic.b_operator;

public class A_산술연산자 {
    public static void main(String[] args) {

      // NOTE BA01 산술연산자
      // +, -, *, /, %

      // NOTE BA02 정수의 산술연산
      System.out.println("=== 정수-정수 산술 연산===");
      int x = 10;
      int y = 3;

      int sum = x + y;
      int diff = x - y;
      int product = x * y;
      int quotient = x / y; // 몫
      int remainder = x % y; // 나머지

      System.out.println("sum = " + sum);
      System.out.println("diff = " + diff);
      System.out.println("product = " + product);
      System.out.println("quotient = " + quotient);
      System.out.println("remainder = " + remainder);
      System.out.println();

      // NOTE BA03 정수-실수 연산
      // 컴퓨터는 같은 타입끼리만 연산이 가능하다.
      // 정수타입의 피연산자를 실수타입으로 형변환(casting)해서 연산을 수행
      double decimalX = 10.5;

      double decimalSum = decimalX + y;
      double decimalDiff = decimalX - y;
      double decimalProduct = decimalX * y;
      double decimalQuotient = decimalX / y;
      double decimalRemainder = decimalX % y;

      System.out.println("=== 정수-실수 ===");
      System.out.println("decimalSum = " + decimalSum);
      System.out.println("decimalDiff = " + decimalDiff);
      System.out.println("decimalProduct = " + decimalProduct);
      System.out.println("decimalQuotient = " + decimalQuotient);
      System.out.println("decimalRemainder = " + decimalRemainder);
      System.out.println();

      System.out.println("=== 실수-실수 ===");
      // float : 부동소수점표현방식(자리를 픽스를 해두는게 아니라 둥둥떠다님), 100.3, 0.11112
      // 순환소수, 무리수 => 컴퓨터가 정확히 표현할 수 없음, 할당받은 bit 수는 한정적이기 때문에
      // 0.1을 2진수로 변환하는 과정에서 순환소수로 바뀐다.
      System.out.println(0.1 + 0.2); //오차 발생 0.30000000000000004

    }

}
