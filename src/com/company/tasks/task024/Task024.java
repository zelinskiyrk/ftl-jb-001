package com.company.tasks.task024;

import java.util.LinkedList;
import java.util.List;

public class Task024 {
    public static void run() {
        MyStringBuilder sb = new MyStringBuilder();
        Display display = new Display();
        sb.registerObserver(display);
        sb.append("One").append("Two");
    }

    interface Observer {
        void update(String str);
    }

    interface Observable {
        void registerObserver(Observer o);
        void removeObserver (Observer o);
        void notifyObservers ();
    }

    static class MyStringBuilder implements Observable{
        StringBuilder stringBuilder = new StringBuilder();
        private List<Observer> observers;
        private int start, end;
        private String str;

        public MyStringBuilder() {
            observers = new LinkedList<>();
        }

        MyStringBuilder append (String string) {
            stringBuilder.append(string);
            notifyObservers();
            return this;
        }

        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            observers.remove(o);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(stringBuilder.toString());
            }
        }
    }

    static class Display implements Observer {

        @Override
        public void update(String str) {
            System.out.println(str);
        }
    }
}
