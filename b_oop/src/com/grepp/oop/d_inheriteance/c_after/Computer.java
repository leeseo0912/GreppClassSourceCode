// 2025.03.10 (월)
package com.grepp.oop.d_inheriteance.c_after;

public class Computer extends Device {
    private String cpu;

    public Computer(String brand, String name, int price, String cpu) {
        super(brand, name, price);
        this.cpu = cpu;
    }

    @Override
    public void on() {
        System.out.println("cpu : " + cpu);
        super.on();

    }

    public void cleanUp(){
        System.out.println("메모리 정리를 수행합니다.");
    }

}
