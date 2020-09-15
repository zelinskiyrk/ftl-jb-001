package com.company.tasks.task015;

public class Task015 {
    public static void run() {
        System.out.println("");
        System.out.println("Task014\n");

        int[] values = {1, 2, 3};
        int[] weights = {1, 2, 10};
        int totalSum = 0;
        int count = 0;

        for (int weight : weights){
            totalSum += weight;
        }

        int random = (int) (Math.random() * totalSum - 1);

        for (int i : values){
            count += weights[i];
            if (count >= random){
                System.out.println(values[i]);
                System.out.println("random = " + random);
            }
        }

//                private int function ( int[] values, int[] weights){
//
//        }
    }
}