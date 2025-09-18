package app;

import geometry.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Circle circle = new Circle(7);
        Triangle tri = new Triangle(6, 4);

        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Triangle area: " + tri.calculateArea());

        // Overloaded methods
        System.out.println("Overloaded Rectangle area: " + rect.calculateArea(8, 3));
        System.out.println("Overloaded Circle area: " + circle.calculateArea(10));
        System.out.println("Overloaded Triangle area: " + tri.calculateArea(5, 2));

        // Extra methods
        System.out.println("Rectangle perimeter: " + rect.calculatePerimeter());
        System.out.println("Circle circumference: " + circle.calculateCircumference());
    }
}
