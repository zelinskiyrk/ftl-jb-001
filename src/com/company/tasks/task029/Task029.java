package com.company.tasks.task029;

import java.util.HashMap;
import java.util.Map;

public class Task029 {

    public static void run() {
        Integer[] myArray = {1, 2, 3, 4, 5, 3, 4, 2, 1 ,5 ,3 ,6};
        System.out.println(convertMyArray(myArray));
        String[] myArray2 = {"one", "two", "three", "two", "one", "two"};
        System.out.println(convertMyArray(myArray2));
    }

    public static <K> Map<K, Integer> convertMyArray(K[] ks) {
        int count = 0;
        Map<K, Integer> arrayElementsCount = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            if (arrayElementsCount.containsKey(ks[i])) {
                arrayElementsCount.put(ks[i], arrayElementsCount.get(ks[i]) + 1);
            }
            else {
                arrayElementsCount.put(ks[i], 1);
            }
        }
        return arrayElementsCount;
    }
}
