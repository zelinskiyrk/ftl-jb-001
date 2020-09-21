package com.company.tasks.task027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task027 {
    public static void run() {
        ArrayList <Integer> arrayList= new ArrayList<>();
        LinkedList <Integer> linkedList = new LinkedList<>();

        fillArray(arrayList);
        fillArray(linkedList);

        System.out.println("");
        System.out.println("");

        pickFromArray(arrayList);
        pickFromArray(linkedList);
    }

    private static void fillArray (List <Integer> list) {
        final int length = 1000000;
        System.out.println("Start fill array " + list.getClass());
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < length; i++) {
            list.add((int) Math.random());
        }

        System.out.println("Passed time: " + (System.currentTimeMillis() - startTime));
    }

    private static void pickFromArray (List <Integer> list) {
        final int pickUp = 100000;
        System.out.println("Start pick elements from array " + list.getClass());

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < pickUp; i++) {
            list.get((int) Math.random()* (list.size() - 1));
        }

        System.out.println("Passed time: " + (System.currentTimeMillis() - startTime));
    }
}
