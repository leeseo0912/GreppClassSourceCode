// 2025.03.11 (화)
package com.grepp.exception.custom;

// NOTE B01 예외객체 만들기
// Checked Exception : 어떤 클래스를 만들때 Exception 클래스를 상속 받으면 됨
// Unchecked Exception : 어떤 클래스를 만들때 RuntimeException 클래스를 상속 받으면 됨

// Checked Exception
public class TimeOutException extends Exception{


    public TimeOutException(String message) {
        super(message);
    }

}
