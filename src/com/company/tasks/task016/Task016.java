package com.company.tasks.task016;

import java.util.Arrays;

public class Task016 {
    public static void run() {
        System.out.println("");
        System.out.println("Task016\n");

        double[] array = generateArray(100000000);

        Arrays.sort(array);

        System.out.println("Iterate search");
        long time = System.currentTimeMillis();
        System.out.println(iterateSearch(array, 99991998));
        System.out.println(System.currentTimeMillis() - time);

        System.out.println("Binary search");
        time = System.currentTimeMillis();
        System.out.println(binarySearch(array, 99991998));
        System.out.println(System.currentTimeMillis() - time);
    }

    private static double[] generateArray(int length){
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100000000);
        }
        return array;
        }

    public static int iterateSearch(double[] array, int number){
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] array, int number){
        int indexMin = 0;
        int indexMax = array.length - 1;
        int indexMiddle;

        do {
            indexMiddle = (indexMax + indexMin) / 2;
            if (array[indexMiddle] > number){
                indexMax = indexMiddle;
            } else if (array[indexMiddle] < number){
                indexMin = indexMiddle;
            } else return indexMiddle;
        } while ((indexMax - indexMin) >= 2);

        if (indexMin == number || indexMiddle == number || indexMax == number)
            return number;
        return -1;
    }

}
