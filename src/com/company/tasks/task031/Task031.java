package com.company.tasks.task031;

public class Task031 {
    public static void run() {

        Object lock = new Object();
        new ThreadQueue(lock).start();
        new ThreadQueue(lock).start();
    }
}
