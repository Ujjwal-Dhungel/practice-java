package geometry;

// Abstract class
public abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle class
class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    // Method overloading
    public double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

// Circle class
class Circle extends Shape {
    private int radius;
    private static final double PI = 3.14159;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateArea(int radius) {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}

// Triangle class
class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculateArea(int base, int height) {
        return 0.5 * base * height;
    }
}
