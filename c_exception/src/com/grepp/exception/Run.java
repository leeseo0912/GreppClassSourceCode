package com.grepp.exception;

import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throws를 하면 JVM이 예외처리를 해준다.
    // 단, 이 경우는 개발자가 예외처리를 하는 것이 아니기 때문에 권장하지 않는다. → try-catch문 권장
    public static void main(String[] args) {
        A_Exception ex = new A_Exception();
        // runtime.arithEx();
        // ex.malformedURLEx();

        try {
            ex.throwsMalformedURLEx();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
