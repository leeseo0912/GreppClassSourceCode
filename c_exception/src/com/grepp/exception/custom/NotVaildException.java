// 2025.03.11 (화)
package com.grepp.exception.custom;

// Runtime Exception : 실행되는 시점에 발생하는 예외
// UnChecked Exception  : 코드로 예외처리가 가능한 경우, 예외처리를 강제하지 않는 Exception
public class NotVaildException extends RuntimeException{
    public NotVaildException(String message) {
        super(message);
    }
}
