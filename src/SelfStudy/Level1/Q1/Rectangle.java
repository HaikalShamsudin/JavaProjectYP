package SelfStudy.Level1.Q1;

public class Rectangle {
    
    //declare the variable
    int length;
    int breath;

    //contructor
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breath = breadth;
    }

    //method
    public double getArea() {
        return length*breath;
    }
    public int getPerimeter() {
        return length+breath;
    }

    public static void main(String[] args) {
        
        //create object
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println("Rectangle A:" + " Area:" + rectangle1.getArea() + "Perimeter:" + rectangle1.getPerimeter());
        System.out.println("Rectangle B:" + " Area:" + rectangle2.getArea() + "Perimeter:" + rectangle2.getPerimeter());

    }
}
