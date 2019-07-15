package chapter3.interfaces;

import chapter3.abstract_class.Rectangle;

public class CenteredRectangle extends Rectangle implements Centered {
    // New instance fields
    private double cx, cy;
    // A constructor
    public CenteredRectangle(double cx, double cy, double w, double h) {
        super(w, h);
        this.cx = cx;
        this.cy = cy;
    }
    // We inherit all the methods of Rectangle but must
    // provide implementations of all the Centered methods.
    public void setCenter(double x, double y) { cx = x; cy = y; }
    public double getCenterX() { return cx; }
    public double getCenterY() { return cy; }
}