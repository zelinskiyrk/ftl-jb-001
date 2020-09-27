package com.company.tasks.task032;

import java.util.ArrayList;
import java.util.List;

public class Task032 {

        private static List<Integer> commonData = new ArrayList<>();

        public static void run() {

            Thread consumer = new Thread(() -> {
                while (true) {
                    synchronized (commonData) {
                        if (!commonData.isEmpty()) {
                            Integer i = commonData.remove(0);
                            System.out.println("TOOK " + i + " " + commonData.toString());
                        }
                    }
                }
            });

            Thread producer = new Thread(() -> {
                int maxCapacity = 50;
                while (true) {
                    synchronized (commonData) {
                        if (commonData.size() < maxCapacity) {
                            int randInt = (int) (Math.random() * 100);
                            commonData.add(randInt);
                            System.out.println("ADD " + randInt + " " + commonData.toString());
                        }
                    }
                }
            });

            producer.start();
            consumer.start();
    }
}
