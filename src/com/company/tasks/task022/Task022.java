package com.company.tasks.task022;

public class Task022 {
    public static void run() {
        System.out.println("");
        System.out.println("Task021\n");

        double temperature = 35.7;

        System.out.println("Температура в Цельсиях: " + new Celsius().getValue(temperature));
        System.out.println("Температура в Фаренгейтах: " + new Fahrenheit().getValue(temperature));
        System.out.println("Температура в Кельвинах: " + new Kelvin().getValue(temperature));
        System.out.println("Температура в Реомюрах: " + new Reaumur().getValue(temperature));
    }
}
