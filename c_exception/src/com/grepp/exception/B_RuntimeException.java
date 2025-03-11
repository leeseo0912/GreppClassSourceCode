// 2025.03.11 (화)
package com.grepp.exception;

import java.util.Random;
import java.util.Scanner;

public class B_RuntimeException {

    public static void main(String[] args) {
        // arithEx();
        multiEx();
    }

    // UnChecked Exception도 예외처리 가능
    public static void arithEx() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                System.out.print("숫자 : ");
                int num = sc.nextInt();

                int random = new Random().nextInt(0, 4); // 0~3 반환
                int result = num / random;
                System.out.println("나누어진 몫은" + result + " 입니다.");

                if (num == 444) break;
            }catch (ArithmeticException e){
                System.out.println("0이 나와서 다시 입력해주세요");

            }

        }
    }


    static void multiEx(){
        try{
            // ClassCastException (형변환 에러)
            Object obj = new Object();
            // String str = (String) obj;

            // ArrayIndexOutOfBoundsException
            int[] arr = new int[2];
            // arr[2] = 10;

            // 레퍼런스에 null이 담겨있을때 발생 오류(참조 연산자를 사용했을때 발생하는 오류)
            String nullStr = null;
            // null이 담겨있는 참조변수로 속성이나 메서드를 사용하려 할 경우 발생하는 예외
            nullStr.equals("a");

//        }catch (ArithmeticException e){
//            System.out.println("ClassCastException의 catch block");
//            System.out.println(e.getMessage());
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException의 catch block");
//            System.out.println(e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException의 catch block");
//            System.out.println(e.getMessage());
//        }catch (Exception e){ // 이걸로 모든 예외를 한번에 처리 할 수 있음
//            System.out.println(e.getMessage());
        }catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e){ // 예외 처리 전략이 똑같을 때
            System.out.println(e.getMessage());
        }
    }

}
