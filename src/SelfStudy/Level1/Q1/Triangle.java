package SelfStudy.Level1.Q1;

public class Triangle {
    
    //declare variable
    double a;
    double b;
    double c;

    //contructor 
    // public Triangle() {
        // this.a = 3;
        // this.b = 4;
        // this.c = 5;
    // }

    //Method 1, getArea
    public double getArea() {
        double s = ((a+b+c)/2);
        return Math.sqrt(s * (s-a) * (s - b) * (s - c)); 

    }

    //method 2, get perimeter
    public double getPerimeter() {
        return a + b + c;
    }

    public static void main(String[] args) {
        
        //create object of the triangle class
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;

        System.out.println("Area of the triangle:" + triangle.getArea());
        System.out.println("Perimeter of the triangle:" + triangle.getPerimeter());
        
    }
}
