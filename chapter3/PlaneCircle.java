package chapter3;

public class PlaneCircle extends Circle {
    // We automatically inherit the fields and methods of Circle,
    // so we only have to put the new stuff here.
    // New instance fields that store the center point of the circle
    private final double cx, cy;
    // A new constructor to initialize the new fields
    // It uses a special syntax to invoke the Circle() constructor
    public PlaneCircle(double r, double x, double y) {
        super(r); // Invoke the constructor of the superclass, Circle()
        this.cx = x; // Initialize the instance field cx
        this.cy = y; // Initialize the instance field cy
    }
    public double getCentreX() {
        return cx;
    }
    public double getCentreY() {
        return cy;
    }
    // The area() and circumference() methods are inherited from Circle
    // A new instance method that checks whether a point is inside the circle
    // Note that it uses the inherited instance field r
    public boolean isInside(double x, double y) {
        double dx = x - cx, dy = y - cy; // Distance from center
        double distance = Math.sqrt(dx*dx + dy*dy); // Pythagorean theorem
        return (distance < r); // Returns true or false
    }

    public static void main(String[] args) {
        PlaneCircle pc = new PlaneCircle(3,1,2);
        if (args.length != 2)
        {
            System.out.println("You must pass 2 numbers as parameters.");
            return;
        }
        //System.out.println(pc.isInside(2,3));
        //System.out.println(pc.isInside(2,7));
        //System.out.println(pc.isInside(5,3));
        System.out.println(pc.isInside(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
    }
}