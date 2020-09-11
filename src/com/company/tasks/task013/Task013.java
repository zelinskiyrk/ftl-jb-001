package com.company.tasks.task013;

import java.util.ArrayList;

public class Task013 {
    public static void run() {
        System.out.println("");
        System.out.println("Task011\n");

        int[] array = {1, 2, 3, 4, 3, 6, 3, 9, 8, 3, 10};
        System.out.println("Original array");
        for (int n : array)
            System.out.print(n + " ");
        System.out.println();

        // Подсчет вхождений сравниваемого числа в исходный массив
        int num = 3;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == num){
                count++;
            }
        }

        // Создание нового массива и заполнение данными, исключая число в переменной num.
        int newArray[] = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != num) {
                newArray[j++] = array[i];
            }
        }

        System.out.println("New array");
        for (int n : newArray)
            System.out.print(n + " ");
        System.out.println();

    }
}
