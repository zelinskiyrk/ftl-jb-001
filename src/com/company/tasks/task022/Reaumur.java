package com.company.tasks.task022;

public class Reaumur implements Converting{
    @Override
    public double getValue(double value) {
        return value * 0.8;
    }
}
