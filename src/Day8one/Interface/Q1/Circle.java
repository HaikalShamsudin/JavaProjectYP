package Day8one.Interface.Q1;

public class Circle extends AbstractShape{

    
    public Circle(String color, boolean filled) {
        super("red", true);
    }

    double radius = 4;
    double PI = 3.142;

    @Override
    public void getArea() {
        double a = Math.pow(PI*radius,2);
        System.out.println("The area is:" + a);
    }
        
    @Override
    public void getParameter() {
        double p = 2*PI*radius;
        System.out.println("The parameter is:" + p);
    }

}
