package com.grepp.oop.d_inheriteance.c_before;

public class SmartPhone {
    private  String brand;
    private String name;
    private int price;
    private String cpu;
    private String angency;

    public SmartPhone(String brand, String name, int price, String cpu, String angency) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.cpu = cpu;
        this.angency = angency;
    }

    public void on(){
        System.out.println(name + "켰습니다.");
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cpu='" + cpu + '\'' +
                ", angency='" + angency + '\'' +
                '}';
    }
}
