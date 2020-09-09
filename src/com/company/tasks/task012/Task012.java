package com.company.tasks.task012;

public class Task012 {
    public static void run() {
        System.out.println("");
        System.out.println("Task011\n");

        for(int i = 2; i < 100; i++){
            int count = 0;
            for(int j = 2; j <= i; j++){
                if ((i % j) == 0){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(i);
            }
        }


    }
}
