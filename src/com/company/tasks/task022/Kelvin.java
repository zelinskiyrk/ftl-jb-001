package com.company.tasks.task022;

public class Kelvin implements Converting{
    @Override
    public double getValue(double value) {
        return value + 273.15;
    }
}
