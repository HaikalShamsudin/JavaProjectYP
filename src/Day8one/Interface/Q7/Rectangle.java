package Day8one.Interface.Q7;

public class Rectangle implements SortableShape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
    
}
