// 2025.03.11 (화)
package com.grepp.exception;
import com.grepp.exception.custom.TimeOutException;
import com.sun.security.jgss.GSSUtil;

import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throws를 하면 JVM이 예외처리를 해준다.
    // 단, 이 경우는 개발자가 예외처리를 하는 것이 아니기 때문에 권장하지 않는다. → try-catch문 권장
    public static void main(String[] args) {
        A_Exception ex = new A_Exception();
        // runtime.arithEx();
        // ex.malformedURLEx();
        // ex.throwsMalformedURLEx();
        // ex.throwNotVaildEx(100);
        //System.out.println("예외처리 이후 코드");

        // 코드에서 컨트롤 할 수 없는 어떤 예외처리에서 로그를 찍고 그 다음에도 프로그램이 정상적으로 실행하게 하기 위한 로직 = checked exception
        // unchcked excepion 예외가 발생하면 그 뒤에 어떤 코드를 써도 그다음 코드가 실행되지 못하고 프로그램이 종료
        try {
            ex.throwTimeOutEx();
            System.out.println("클라이언트야 안녕?");
        } catch (TimeOutException e) {
            System.out.println("catch 블록입니다.");
            System.out.println("죄송합니다. 연결에 실패했습니다. 라고 사용자에게 알린다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("try-catch 이후 코드");
    }

}
