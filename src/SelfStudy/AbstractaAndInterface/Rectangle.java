package SelfStudy.AbstractaAndInterface;

// Concrete class representing a Rectangle
@SuppressWarnings("unused")
class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method from the abstract class
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implementation of draw method from the Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with color " + getColor());
    }
}
