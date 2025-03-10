// 2025.03.06(목)
package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

  public static void main(String[] args) {
    //q1();
    //q2();
    //q3();
    //q4();
    //q5();
    //q6();

  }


  private static void q1() {
    Scanner sc = new Scanner(System.in);
    System.out.print("row = ");
    int row = sc.nextInt();

    System.out.print("col = ");
    int col = sc.nextInt();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void q2() {
    Scanner sc = new Scanner(System.in);
    System.out.print("num = ");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  private static void q3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("num = ");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if(i == j) {
          System.out.print(i + 1);
        } else{
          System.out.print("*");
        }
      }
      System.out.println();
    }

  }


  private static void q4() {
    Scanner sc = new Scanner(System.in);
    System.out.print("num = ");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      // 공백 찍기 -> num - i
      for (int j = 0; j < num - i; j++) {
        System.out.print(" ");
      }
      // 별 찍기 -> 2 * n -1
      for (int j = 0; j < 2 * i -1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  private static void q5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("num = ");
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      //공백
      for (int j = 0; j < num-i; j++) {
        System.out.print(" ");
      }
      //별
      for (int j = 0; j < 2 * i -1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 뒤집 -> num -1
    for (int i = 1; i < num; i++) {
      //공백 -> i-1
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // 별 ->
      for (int j = 0; j < 2 * (num -i) -1 ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  private static void q6() {
    Scanner sc = new Scanner(System.in);
    System.out.print("num = ");
    int num = sc.nextInt();
    //num = 5 가로

    // 나비 모양의 위쪽
    for (int i = 1; i <= num; i++) {
      //part 1별
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      //part 2공백
      for (int j = 1; j <= 2 * (num - i) ; j++) {
        System.out.print(" ");
      }

      //part 3별
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 나비모양 아래쪽
    for (int i = 1 ; i < num ; i++) {
      //part1 별
      for (int j = 1; j <= num-i ; j++) {
        System.out.print("*");
      }
      //part2 공백
      for (int j = 1; j <= i * 2 ; j++) {
        System.out.print(" ");
      }
      //part3 별
      for (int j = 1; j <= num-i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
