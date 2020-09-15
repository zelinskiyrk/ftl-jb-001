package com.company.tasks.task014;

public class Vector {
    private double x;
    private double y;
    private double z;

    // Конструктор класса Vector
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Вычисление длины вектора
    public double length() {
        double length = Math.sqrt(x * x + y * y + z * z);
        return length;
    }

    // Скалярное произведение векторов
    public double scalarMultiply(Vector vector1, Vector vector2) {
        return (vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z);
    }

    // Векторное произведение векторов
    public Vector vectorMultiply(Vector vector1, Vector vector2) {
        return new Vector(vector1.y * vector1.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z,
                vector1.x * vector2.y - vector1.y * vector2.x);
    }

    // cos угла
    public double cos(Vector vector1, Vector vector2) {
        return scalarMultiply(vector1, vector2) / (vector1.length() * vector2.length());
    }

    // Методы для суммы и разности
    public Vector sum(Vector vector1, Vector vector2) {
        return new Vector(vector1.x + vector2.x,
                vector1.y + vector2.y,
                vector1.z + vector2.z);
    }

    public Vector dif(Vector vector1, Vector vector2) {
        return new Vector(vector1.x - vector2.x,
                vector1.y - vector2.y,
                vector1.z - vector2.z);
    }

    // Массив случайных векторов
    public static Vector[] randomVectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

}
