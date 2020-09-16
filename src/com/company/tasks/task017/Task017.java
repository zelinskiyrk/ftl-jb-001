package com.company.tasks.task017;

public class Task017 {
    public static void run() {
        System.out.println("");
        System.out.println("Task017\n");

        System.out.println(equationSolve(0, 10));
    }

    public static double function(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x -23;
    }

    public static double equationSolve(double begin, double end){
        double middle = begin + (end - begin)/2;

        if (Math.abs(function(middle)) < 0.001){
 //       if (end - begin <= 0.001){
            return middle;
        }

        if (function(begin) * function(middle) < 0){
            return equationSolve(begin, middle);
        } else {
            return equationSolve(middle, end);
        }
    }
}