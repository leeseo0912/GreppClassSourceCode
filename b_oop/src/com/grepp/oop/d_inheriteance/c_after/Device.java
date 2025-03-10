package com.grepp.oop.d_inheriteance.c_after;

public class Device {
    private String brand;
    private String name;
    private int price;

    public Device(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public void on(){
        System.out.println(name + "켰습니다.");
    }
}
