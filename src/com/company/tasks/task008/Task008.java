package com.company.tasks.task008;

public class Task008 {
    public static void run() {
        System.out.println("");
        System.out.println("Task008");

        int fib_arr [] = new int[11];
        fib_arr[0] = 1;
        fib_arr[1] = 1;
        for(int i = 2; i < 11; i++){
            fib_arr[i] = fib_arr[i - 1] + fib_arr[i - 2];
        }
        for(int j = 0; j < 11; j++){
            System.out.print(fib_arr[j] + " ");
        }

    }
}
