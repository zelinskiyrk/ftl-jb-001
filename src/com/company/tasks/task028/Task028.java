package com.company.tasks.task028;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task028 {
    public static void run() {
        TwoDArray<Integer> array = new TwoDArray<>(new Integer[][]{{2, 3, 0}, {5, 6, 7, 0}, {8, 9, 10, 0}});
        for (Integer i : array) {
            System.out.print(i + " ");
        }

    }

    public static class TwoDArray<T> implements Iterable<T> {

        T[][] myArray;

        public TwoDArray(T[][] myArray) {
            this.myArray = myArray;
        }


        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {

                private int i, j;

                @Override
                public boolean hasNext() {
                    for (int i = this.i; i < myArray.length; i++) {
                        for (int j = this.j; j < myArray[i].length; j++) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public T next() {
                    if (!hasNext())
                        throw new NoSuchElementException();

                    T t = myArray[i][j];
                    j++;
                    for(int i = this.i; i< myArray.length; i++){
                        for(int j = (i == this.i ? this.j : 0); j< myArray[i].length; j++){
                            this.i = i;
                            this.j = j;
                            return t;
                        }
                    }
                    return t;
                }
            };
        }
    }
}
