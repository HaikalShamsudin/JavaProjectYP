package Day5.Exercise2AbstractClass;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;               //DECLARE VARIABLE

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea () {
        return PI * radius;
    }
}
