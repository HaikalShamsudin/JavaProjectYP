package Day5.FinalClass;

private final class Circle {                                   
    
    //DECLARE VARIABLE
    private final double radius;
    private final double PI = 3.14159;

    //CONSTRUCTOR - to initialize the value
    public Circle(double radius){
        this.radius = radius;
    }

    //METHOD
    public double getArea() {
        return PI*radius*radius;
    }

    public static void main(String[] args) {
        
        //create object of the circle
        Circle circle = new Circle(5);
        System.out.printf("Area of the Circle: %.2f", circle.getArea());
    }
    
}

// A final class in Java cannot be subclassed. It means that no other class can extend a final class.
// Final classes are used when you want to prevent inheritance or extension of a class. This is
// appropriate when you have a class that should not have any subclasses or when you want to ensure
// that the behavior of the class remains consistent and cannot be changed by subclasses.

