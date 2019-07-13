package chapter3;

public class Circle {
    public static final double PI = 3.14159; // A constant

    // An instance field that holds the radius of the circle
    protected double r;

    // The constructor: initialize the radius field
    public Circle(double r) {
         this.r = r;
    }
    // The instance methods: compute values based on the radius
    public double circumference() {
        return 2 * PI * r;
    }

    public double area() {
        return PI * r*r;
    }
    public double radius() { return r; }
}