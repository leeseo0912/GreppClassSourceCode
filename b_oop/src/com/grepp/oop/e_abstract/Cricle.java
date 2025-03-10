// 2025.03.10 (월)
package com.grepp.oop.e_abstract;

public class Cricle extends Figure{
    protected double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
