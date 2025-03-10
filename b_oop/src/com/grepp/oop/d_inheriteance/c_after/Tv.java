package com.grepp.oop.d_inheriteance.c_after;

// Device 클래스를 상속 받는다.ㅔ
public class Tv extends Device{
    private int size;

    public Tv(String brand, String name, int price, int size) {
        super(brand, name, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "size=" + size +
                '}';
    }
}
