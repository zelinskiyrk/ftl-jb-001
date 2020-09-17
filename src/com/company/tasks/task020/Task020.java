package com.company.tasks.task020;

import java.util.ArrayList;
import java.util.Collections;

public class Task020 {
    public static void run() {
        System.out.println("");
        System.out.println("Task020\n");

        Pyramid pyramid = new Pyramid(10, 5);
        Cylinder cylinder = new Cylinder(5, 15);
        Ball ball = new Ball(7);
        Box box = new Box(1500);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));

        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes);
        System.out.println(shapes.toString());
    }
}

