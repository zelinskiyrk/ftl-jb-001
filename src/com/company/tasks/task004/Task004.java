package com.company.tasks.task004;

import java.util.Scanner;

public class Task004 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        };
        System.out.println(sum);
    }
}
