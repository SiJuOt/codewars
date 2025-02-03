package de.sijuot.codewars;

import java.util.List;

public class ShapeUtilities {

    /**
     * Berechnet den Flächeninhalt von allen geometrischen Formen.
     * @param shapes Eine List mit den geometrischen Formen.
     * @return Die Fläche.
     */
    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }
}

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}