package com.grepp.basic.d_control;

import java.util.Scanner;

public class z_quiz {

  public static void main(String[] args) {
    quiz();
  }

  // q.
  // 1P 유저로부터 가위/바위/보 중 하나를 입력받으세요
  // 2P 유저로부터 가위/바위/보 중 하나를 입력받으세요.
  // 1P 유저기준에서 승/패/비김 여부를 출력해주세요.
  public static void quiz() {
    Scanner sc = new Scanner(System.in);
    System.out.print("1P : ");
    String p1 = sc.next();
    System.out.print("2P : ");
    String p2 = sc.next();

    String result = "";
    String a = "가위", b = "바위", c = "보";

    if (p1.equals(a)) { // p1 가위
      if (p2.equals(a)) result = "비김";
      if (p2.equals(b)) result = "패배";
      if (p2.equals(c)) result = "승";
    } else if (p1.equals(b)) { // p1 바위
      if (p2.equals(a)) result = "승";
      if (p2.equals(b)) result = "비김";
      if (p2.equals(c)) result = "패배";
    } else if (p1.equals(c)) { // p1 보
      if (p2.equals(a)) result = "패배";
      if (p2.equals(b)) result = "승";
      if (p2.equals(c)) result = "비김";
    }

    System.out.println("결과 : " + result);

  }
}


