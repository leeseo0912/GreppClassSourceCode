package com.grepp.oop.d_inheriteance.c_before;

import java.security.PrivateKey;

public class Tv {
    private String brand;
    private String name;
    private int Price;
    private int size;

    public Tv(String brand, String name, int price, int size) {
        this.brand = brand;
        this.name = name;
        Price = price;
        this.size = size;
    }

    public void on(){
        System.out.println(name + "켰습니다.");
    }


    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                ", size=" + size +
                '}';
    }
}
