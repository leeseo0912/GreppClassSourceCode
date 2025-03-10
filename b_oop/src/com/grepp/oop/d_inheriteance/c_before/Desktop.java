package com.grepp.oop.d_inheriteance.c_before;

public class Desktop {
    private  String brand;
    private  String name;
    private  int price;
    private String cpu;
    private boolean allInOne;

    public Desktop(String brand, String name, int price, String cpu, boolean allInOne) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.allInOne = allInOne;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cpu='" + cpu + '\'' +
                ", allInOne=" + allInOne +
                '}';
    }
}
