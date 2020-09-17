package com.company.tasks.task019;

public class Task019 {
    public static void run() {
        System.out.println("");
        System.out.println("Task019\n");

        Pyramid pyramid = new Pyramid(11, 5);
        Cylinder cylinder = new Cylinder(4, 15);
        Ball ball = new Ball(7);
        Box box = new Box(1500);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}

