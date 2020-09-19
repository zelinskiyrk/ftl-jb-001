package com.company.tasks.task023;

public class Task023 {

    public static void run() {
        String result = new MyStringBuilder().append("We").append("learn").undo().toString();
        System.out.println(result);

        String result2 = new MyStringBuilder().append("You").append(" my").append(" friend").delete(3,6).toString();
        System.out.println(result2);

        String result3 = new MyStringBuilder().append("You").append(" my").append(" friend").delete(3,6).undo().toString();
        System.out.println(result3);

    }
}
