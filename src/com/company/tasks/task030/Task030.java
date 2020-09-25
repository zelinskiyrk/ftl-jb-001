package com.company.tasks.task030;

import java.util.Arrays;

public class Task030 {

        private static void threadInfo(Thread thread) {
            System.out.println("Thread: " + thread.getName());
            System.out.println("Id: " + thread.getId());
            System.out.println("Priority: " + thread.getPriority());
            System.out.println("State: " + thread.getState());
            System.out.println("Thread Group: " + thread.getThreadGroup());
        }

        public static void run() {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadInfo(Thread.currentThread());
                }
            });

            System.out.println("START THREAD:");
            threadInfo(thread);
            thread.start();
            System.out.println("FINISH THREAD:");
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadInfo(thread);

        }
}

