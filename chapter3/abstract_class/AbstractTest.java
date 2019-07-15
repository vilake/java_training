package chapter3.abstract_class;

public class AbstractTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3]; // Create an array to hold shapes
        shapes[0] = new Circle(2.0); // Fill in the array
        shapes[1] = new Rectangle(1.0, 3.0);
        shapes[2] = new Rectangle(4.0, 2.0);
        double totalArea = 0;
        for(int i = 0; i < shapes.length; i++)
            totalArea += shapes[i].area(); // Compute the area of the shapes

        System.out.println("Total area = "+ totalArea);
    }
}