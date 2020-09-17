package com.company.tasks.task020;

public interface Shape extends Comparable<Shape>{

    public double getVolume();

    @Override
    default int compareTo(Shape o){
        return Double.compare(getVolume(), o.getVolume());
    };


}
