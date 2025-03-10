// 2025.03.06(목)
package com.grepp.basic.f_array;

import java.util.Arrays;

public class A_array {

  public static void main(String[] args) {
    //pracArray();
    sallowCopy();
  }

  private static void sallowCopy() {
    // NOTE FA02 얕은 복사
    // 객체의 주소값만 복사 해줌 -> our에서 닭꼬치>떡볶이로 바꾸니 baek도 떡볶이로 바뀌어버림
    String[] baek = {"김밥", "오뎅", "닭꼬치"};
    System.out.println(Arrays.toString(baek));
    String[] our = changeMenu(baek);
    System.out.println(Arrays.toString(our));
    System.out.println(Arrays.toString(baek));


  }
  // 얕은복사로 원본데이터를 변경하는 메서들은 반환타입이 void이거나 성공실패여부(boolean)를 전달
  // 깊은복사로 새로운 데이터를 생성하는 경우는 새롭게 생성한 데이터의 타입은 반환타입으로 지정
  // side effect : 함수 내부의 로직이 함수 외부에 영향을 끼치는 상황
  private static String[] changeMenu(String[] baek) {
    // 얕은 복사 -> 객체의 주소값만 복사 해줌 = our에서 닭꼬치>떡볶이로 바꾸니 baek도 떡볶이로 바뀌어버림
    // baek[2] = "떡볶이";
    // return baek;

    // 깊은 복사 -> 새로운 배열을 만들고 그 배열에 원본 배열을 복사해오기
    String[] result = new String[baek.length];
    for(int i = 0; i< baek.length; i++){
      result[i] = baek[i];
    }
    result[2] = "떡볶이";
    return result;

  }



  private static void pracArray() {
    // NOTE FA01 Array
    // 배열 : 같은 타입의 데이터를 하나의 묶음으로 다루는 자료구조
    // 배열에 저장된 데이터는 index를 사용해 접근할 수 있다.

    // 배열선언
    // 타입[] 변수명 = new 타입[크기]
    String[] foods = new String[5];
    foods[0] = "치킨";
    foods[1] = "족발";
    foods[2] = "회";
    foods[3] = "피자";
    foods[4] = "마라탕";
    System.out.println(foods[3]);

    // 배열의 선언과 동시에 초기화
    int[] nums = new int[]{1,2,3,4,5};
    // length : 배열의 크기
    for(int i = 0; i < nums.length; i++){
      System.out.println(nums[i]);
    }
    System.out.println();

    int[] nums2 = {999, 888, 777, 666, 555};
    // NOTE FA01 : 향상된 for문, for-each
    // int e : 반환받을 요소
    // nums2 : 반복가능한 객체
    for(int e : nums2){
      System.out.print(e + " ");
    }
    System.out.println();
  }

}
