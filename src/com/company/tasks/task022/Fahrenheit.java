package com.company.tasks.task022;

public class Fahrenheit implements Converting{

    @Override
    public double getValue(double value) {
        return (9 / 5) * value + 32;
    }
}
