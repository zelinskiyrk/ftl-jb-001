package com.company.tasks.task018;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double freeVolume;

    public Box(double freeVolume) {
        super(freeVolume);
        this.freeVolume = freeVolume;
    }

    public boolean add(Shape shape){
        if (freeVolume >= shape.getVolume()){
            shapes.add(shape);
            freeVolume -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
