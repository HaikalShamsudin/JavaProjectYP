package SelfStudy.AbstractaAndInterface;

// Abstract class representing a basic shape
abstract class Shape implements Drawable {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Abstract method for calculating area
    abstract double calculateArea();
}
