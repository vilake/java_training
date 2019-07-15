package chapter3.abstract_class;

class Circle extends Shape {
    public static final double PI = 3.14159265358979323846;
    protected double r; // Instance data
    public Circle(double r) { this.r = r; } // Constructor
    public double getRadius() { return r; } // Accessor
    public double area() { return PI*r*r; } // Implementations of
    public double circumference() { return 2*PI*r; } // abstract methods.
}