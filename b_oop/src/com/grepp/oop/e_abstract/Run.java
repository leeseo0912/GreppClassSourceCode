// 2025.03.10 (월)
package com.grepp.oop.e_abstract;

public class Run {
    public static void main(String[] args) {
        Figure circle = new Cricle(5);
        Figure rectangle = new Rectangle(10,10);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());
    }

}
