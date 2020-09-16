package com.company.tasks.task018;

public class Task018 {
    public static void run() {
        System.out.println("");
        System.out.println("Task018\n");

        Pyramid pyramid = new Pyramid(10, 5);
        Cylinder cylinder = new Cylinder(3, 15);
        Ball ball = new Ball(7);
        Box box = new Box(1500);

        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}