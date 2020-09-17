package com.company.tasks.task020;

import java.util.ArrayList;

public class Box implements Shape {

    private ArrayList shapes = new ArrayList<>();
    private double freeVolume;
    private double volume;

    public Box(double freeVolume) {
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

    @Override
    public double getVolume() {
        return volume;
    }

    public ArrayList<Shape> getShapes(){
        return shapes;
    }

    @Override
    public String toString() {
        return "Box{" +
                "shapes=" + shapes +
                '}';
    }
}
