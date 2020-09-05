package com.company.tasks.task009;

import java.util.Scanner;

public class Task009 {
    public static void run(){
        System.out.println("");
        System.out.println("Task009");

        int count = 0;
        String answer = "троллейбус";
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");

        while (count < 3) {
            Scanner input = new Scanner(System.in);
            String user_answer = input.nextLine().toLowerCase();

            switch (user_answer) {
                case "троллейбус":
                    System.out.println("Правильно");
                    count = 3;
                    break;
                case "сдаюсь":
                    System.out.println("Правильный ответ: " + answer);
                    count = 3;
                    break;
                default:
                    System.out.println("Подумай еще");
                    count++;
            }
        }
    }
}
