// 2025.03.10 (월)
package com.grepp.oop.d_inheriteance.c_after;

public class Run {
    public static void main(String[] args) {
        // Computer desktop = new Desktop 가능 -> Computer를 상속 받기 때문
        Desktop desktop = new Desktop(
                "삼성",
                "갤럭시북 ",
                2000000,
                "intel",
                true
        );

        // 다형성
        // Computer computer = desktop;
        // computer. -> desktop 인스턴스를 computer모양으로 써서 desktop 속성중 올인원 속성을 사용할 수 없음
        // Device device = desktop;


        Computer smartPhone = new SmartPhone(
                "사과",
                "아이폰 ",
                1300000,
                "긱벤치 ",
                "SKT"
        );

        Tv tv = new Tv(
                "삼성",
                "삼텐바이미 ",
                1000000,
                52
        );

//        desktop.on();
//        smartPhone.on();
//        tv.on();

        Device[] devices = {desktop, smartPhone, tv};
        for(Device device : devices){
            device.on();

            // 다향성
            // 컴퓨터 타입을 가진 인스턴스는 스위치를 켠 다음 메모리 정리를 수행 -> cleanUp
            if(device instanceof Computer computer){
                // down casting : 선조타입을 후손타입으로 변환
                // if(device instanceof Computer){
                //    Computer computer = (Computer) device; }
                // up casting : 후손타입을 선조타입으로 변환(자동)
                computer.cleanUp();
            }
            System.out.println("===============================");
        }




    }
}
