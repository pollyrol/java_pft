package ru.stqa.pft.sandbox;

public class rectangle {
    public double a;
    public double b;

    public rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}