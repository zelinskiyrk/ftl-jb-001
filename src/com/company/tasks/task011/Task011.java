package com.company.tasks.task011;

import java.util.Scanner;

public class Task011 {
    public static void run() {
        System.out.println("");
        System.out.println("Task011\n");

        // Определяем размерность массива и вводим необходимые переменные
        System.out.println("Введите длину массива");
        Scanner input = new Scanner(System.in);
        int array_length = input.nextInt();
        int rand_array[] = new int[array_length];
        int index_max = 100;

        // Создание массива
        for(int i = 0; i < array_length; i++){
            int random = (int)(Math.random()*index_max);
            rand_array[i] = random;
        }

        System.out.println("Unsorted array");
        for(int element : rand_array) {
            System.out.print(element + ", ");
        }
        System.out.println("");

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < rand_array.length; i++) {
                if (rand_array[i] < rand_array[i - 1]) {
                    int tempValue = rand_array[i];
                    rand_array[i] = rand_array[i - 1];
                    rand_array[i - 1] = tempValue;
                    isSorted = false;
                }
            }
        }
        System.out.println("Sorted array");
        for(int element : rand_array) {
            System.out.print(element + ", ");
        }
        System.out.println("");

    }
}
