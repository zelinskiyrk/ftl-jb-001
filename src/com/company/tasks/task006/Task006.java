package com.company.tasks.task006;

public class Task006 {
    public static void run(){
        System.out.println("");
        System.out.println("Task006");
        int i = 1;

        while (i <= 512){
            System.out.print(i + " ");
            i+=i;
        }
        System.out.println();
    }
}
