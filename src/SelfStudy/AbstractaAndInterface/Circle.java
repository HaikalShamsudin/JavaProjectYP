package SelfStudy.AbstractaAndInterface;

// Concrete class representing a Circle
@SuppressWarnings("unused")
class Circle extends Shape implements Drawable, Resizable {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of calculateArea method from the abstract class
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of draw method from the Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with color " + getColor());
    }

    // Implementation of resize method from the Resizable interface
    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle. New radius: " + radius);
    }
}
