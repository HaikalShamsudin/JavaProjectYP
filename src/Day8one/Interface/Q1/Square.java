package Day8one.Interface.Q1;

public class Square extends AbstractShape {
    
    public Square(String color, boolean filled) {
        super("blue", false);
    }

    int length = 5;
    int breadth = 5;

    @Override
    public void getArea() {
        int a = length * breadth;
        System.out.println("The area is:" + a);
    }
        
    @Override
    public void getParameter() {
        int p = length + breadth;
        System.out.println(("The parameter is:" + p));
    }
}
