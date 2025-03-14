// 2025.03.10 (월)
package com.grepp.oop.f_interface;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        StarLink smartPhone = new SmartPhone(
                "애플",
                "아이폰",
                1,
                "긱벤치",
                "SKT");

        smartPhone.connect();
        smartPhone.disconnect();

        Https phone = (Https) smartPhone;
        phone.send();
        phone.receive();
        phone.encrypt();

        StarLink.callAgency();

    }
}
