package SelfStudy.AbstractaAndInterface;

// Main class for testing
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Using methods from Drawable interface
        circle.draw();
        rectangle.draw();

        // Using methods from Resizable interface
        circle.resize(1.5);

        // Using calculateArea method from the abstract Shape class
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
