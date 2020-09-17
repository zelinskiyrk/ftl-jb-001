package com.company.tasks.task020;

public abstract class SolidOfRevolution implements Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
