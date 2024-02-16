package Day8one.Interface.Q7;

public class Circle implements SortableShape {

    //declare the variable
    private double radius;
    private double PI = 3.142;

    //constructor
    public Circle(double radius, double PI){
        this.radius = radius;
        this.PI = PI;
    }

    @Override
    public double area() {
        return Math.pow(radius, PI);
    }
    
}
