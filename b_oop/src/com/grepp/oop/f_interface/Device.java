// 2025.03.10 (월)
package com.grepp.oop.f_interface;

public class Device {
    // private는 상속되지 않는다.
    // protected : 자식 클래스에서는 가능하되, 다른 클래스에서 접근 제한
    protected String brand;
    protected String name;
    protected int price;

    public Device(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public void on(){
        System.out.println(name + "켰습니다.");
    }
}
