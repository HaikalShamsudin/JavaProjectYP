package SelfStudy.EX3;

public class TestRectangle {
    
    public static void main(String[] args) {
        
    //calling from rectangle class (constructor)
    Rectangle rectangle = new Rectangle();


    //create variable for area
    int resultArea = rectangle.calculateArea(4, 6);
    System.out.println("Area of rectangle:" + resultArea + "unit");

    //create variable for perimeter
    int resultPerimeter = rectangle.calculatePerimeter(4, 6);
    System.out.println("Perimeter of rectangle:" + resultPerimeter + "unit");

    }
}
