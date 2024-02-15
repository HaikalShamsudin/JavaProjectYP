package Day8one.Interface.Q1;

public class Rectangle extends AbstractShape{

    public Rectangle(String color, boolean filled) {
        super("yellow", true);
    }

    int length = 4;
    int breadth = 5;

    @Override
    public void getArea() {
        int a = length * breadth;
        System.out.println("The area is:" + a);
    }
        
    @Override
    public void getParameter() {
        int p = length + breadth;
        System.out.println("The parameter is:" + p);
    }
    
    
}
