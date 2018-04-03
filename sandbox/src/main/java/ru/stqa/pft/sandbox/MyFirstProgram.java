package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("polina");

        Square s = new Square(6);
        System.out.println("squeare with a side " + s.l + " = " + s.area());

        rectangle r = new rectangle(7, 8);
        System.out.println("squeare with a side " + r.a +" and " + r.b + " = " + r.area());

        Point p = new Point (2, 4, 6, 9);
        System.out.println("The Distance between two points is " + p.distance());

    }


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }



    }

