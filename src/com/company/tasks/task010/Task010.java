package com.company.tasks.task010;

import java.util.Scanner;

public class Task010 {
    public static void run() {
        System.out.println("");
        System.out.println("Task010\n");

        // Определяем размерность массива и вводим необходимые переменные
        System.out.println("Введите длину массива");
        Scanner input = new Scanner(System.in);
        int array_length = input.nextInt();
        int rand_array[] = new int[array_length];
        int index_max = 100;
        double average = 0;
        int sum = 0;

        // Создание массива
        for(int i = 0; i < array_length; i++){
            int random = (int)(Math.random()*index_max);
            rand_array[i] = random;
            System.out.println(rand_array[i]);
        }

        // Расчёт максимального, минимального и среднего значений
        int value_max = rand_array[0];
        int value_min = rand_array[0];

        for(int i =0; i < array_length; i++){
            if (rand_array[i] > value_max){
                value_max = rand_array[i];
            }
        }

        for(int j =0; j < array_length -1; j++){
            if (rand_array[j] < value_min){
                value_min = rand_array[j];
            }
        }

        for(int element : rand_array){
            sum += element;
        }
        average = sum / rand_array.length;


        System.out.println("Максимальное значение в массиве = " + value_max);
        System.out.println("Минимальное значение в массиве = " + value_min);
        System.out.println("Среднее значение элементов = " + average);

    }
}
