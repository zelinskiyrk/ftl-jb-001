package com.company.tasks.task021;

import java.util.HashMap;
import java.util.Map;

public class Task021 {
    public static void run() {
        System.out.println("");
        System.out.println("Task021\n");

        String textEng = "Hash table based implementation of the Map interface. This implementation provides all " +
                "of the optional map operations, and permits null values and the null key. (The HashMap class is " +
                "roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) " +
                "This class makes no guarantees as to the order of the map; in particular, it does not guarantee" +
                " that the order will remain constant over time.";

        String textRus = "HashMap — основан на хэш-таблицах, реализует интерфейс Map (что подразумевает хранение " +
                "данных в виде пар ключ/значение). Ключи и значения могут быть любых типов, в том числе и null. " +
                "Данная реализация не дает гарантий относительно порядка элементов с течением времени. Разрешение" +
                " коллизий осуществляется с помощью метода цепочек.";

        dictionaryCount(textEng);
        dictionaryCount(textRus);

    }
        public static void dictionaryCount (String stringText){
        HashMap <Character, Integer> frequencyDictionary = new HashMap<>();

        for (int i = 0; i < stringText.length(); i++){
            Character symbol = stringText.toLowerCase().charAt(i);
            if (symbol.isLetter(symbol)){
                if (frequencyDictionary.containsKey(symbol)){
                    frequencyDictionary.put(symbol, frequencyDictionary.get(symbol) + 1);
                }
                else
                    frequencyDictionary.put(symbol, 1);
            }
        }

        System.out.println(frequencyDictionary);

        // Вывод с отсортированными значениями
        frequencyDictionary.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer> comparingByValue().reversed())
                .forEach(System.out::println);

    }
}
