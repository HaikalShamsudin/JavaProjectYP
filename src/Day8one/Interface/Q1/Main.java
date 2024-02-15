package Day8one.Interface.Q1;

public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        //create the instance of rectangle, circle and square
        Rectangle rectangle = new Rectangle("yellow",true);
        Circle circle = new Circle("red", true);
        Square square = new Square("blue", false);

        //Demonstrate the rectangle behaviour
        System.out.println("Rectangle color is:" + rectangle.getColor());
        rectangle.getArea();
        rectangle.getParameter();
        System.out.println();

        //Demonstrate the circle behaviour
        System.out.println("Circle color is:" + circle.getColor());
        rectangle.getArea();
        rectangle.getParameter();
        System.out.println();
        
        //Demonstrate the circle behaviour
        System.out.println("Square color is:" + square.getColor());
        rectangle.getArea();
        rectangle.getParameter();
        
        
    }
}
