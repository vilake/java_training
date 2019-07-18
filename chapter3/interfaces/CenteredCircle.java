package chapter3.interfaces;

import chapter3.abstract_class.Circle;

public class CenteredCircle extends Circle implements Centered {
    // New instance fields
    private double cx, cy;
    // A constructor
    public CenteredCircle(double cx, double cy, double r) {
        super(r);
        this.cx = cx;
        this.cy = cy;
    }
    // We inherit all the methods of Rectangle but must
    // provide implementations of all the Centered methods.
    public void setCenter(double x, double y) { cx = x; cy = y; }
    public double getCenterX() { return cx; }
    public double getCenterY() { return cy; }
}