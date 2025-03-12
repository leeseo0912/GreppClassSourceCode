// 2025.03.11 (화)
// 2025.03.12 (수) - private -> protected로
package com.grepp.library.c_collection.a_generic.domain;

public class Device {

    protected  String name;

    public Device(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " 켜졌습니다.");
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }


}
