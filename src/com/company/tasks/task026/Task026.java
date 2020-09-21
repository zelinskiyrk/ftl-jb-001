package com.company.tasks.task026;

import java.util.*;

public class Task026 {
    public static void run() {

        List <Integer> list = new ArrayList<>(Arrays.asList(1 ,2, 3, 4, 5, 6, 4, 7, 3, 8, 2, 9, 1, 10));
        Collection collection = checkedCollection(list);
        System.out.println(collection);

        List <String> listString = new ArrayList<>(Arrays.asList("A", "B", "C", "B"));
        Collection collectionString = checkedCollection(listString);
        System.out.println(collectionString);
    }

    public static <T> Collection<T> checkedCollection (Collection <T> collection) {
        return new HashSet<>(collection);
    }
}