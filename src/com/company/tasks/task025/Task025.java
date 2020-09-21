package com.company.tasks.task025;

import java.util.Arrays;

public class Task025 {
    public static void run() {
        String array[] = new String[]{"One ", "Two", "Three", null, "Five"};

        String[] newArray =  (String[]) MyFilter.filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        System.out.println(Arrays.toString(newArray));
    }

    interface Filter {
        boolean apply(Object o);
    }

    public static class MyFilter {

        public static Object[] filter(Object[] array, Filter filter) {
            int offset = 0;

            for(int i = 0; i< array.length; i++){
                if(!filter.apply(array[i])){
                    offset++;
                } else{
                    array[i - offset] = array[i];
                    System.out.println(array[i-offset]);
                }
            }
            return Arrays.copyOf(array, array.length - offset);
        }
    }
}
