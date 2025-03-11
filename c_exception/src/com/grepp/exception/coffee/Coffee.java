// 2025.03.11 (화)
package com.grepp.exception.coffee;

// checkedExpection이 발생하면 RuntimeException으로 끌어올려서 처리함?
import com.grepp.exception.custom.CommonException;
import com.grepp.exception.custom.TimeOutException;
import com.grepp.exception.custom.TimeOutRuntimeException;

import java.util.Random;

public class Coffee {

    // 한 작업단위로 묶어야 하는 로직에서는 하나로 만드는게 나음
    // 전역 예외 처리를 하자
    // CheckedException을 하면 선언부가 더러워짐 ex) private void purchase() throws TimeOutException → throws 예외 를 모두 해줘야하기 때문
    public void provide(){
        try {
            deductStock();
            addSalesCnt();
            System.out.println("커피음료 제공이 완료되었습니다.");
        } catch (CommonException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addSalesCnt() {
        System.out.println("판매량 추가");
    }

    private void deductStock(){
        System.out.println("재고차감");
        purchase();
    }

    // 은행서버와 통신을 통해 잔고를 확인하고, 매입주문을 넣는 메서드
    private void purchase(){
        int delay = new Random().nextInt(5);

        try{
            if(delay > 0) {
                throw new TimeOutRuntimeException("은행 서버와 연결되지 못했습니다.");
            }
        } finally {
            // 통신을 빨리 종료하는게 좋으니까 이렇게 선언
            // catch를 안만들고 finally로 바로 처리 가능함
            System.out.println("은행서버와의 통신을 종료합니다.");
        }


        System.out.println("재고 매입에 성공했습니다.");
    }
}
