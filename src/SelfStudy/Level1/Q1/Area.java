package SelfStudy.Level1.Q1;

import java.util.Scanner;

/*Write a program to print the area of a rectangle by creating a class named 'Area' 
having two methods. First method named as 'setDim' takes length and breadth of 
rectangle as parameters and the second method named as 'getArea' returns the area 
of the rectangle. Length and breadth of rectangle are entered through keyboard. */

// first class, area class
public class Area {

    public static void main(String[] args) {            
        
        Area rectangle = new Area();        //create and instance of 'Area' class

        Scanner scanner = new Scanner(System.in);       //taking input from the user
        System.out.println("Enter the length");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth");
        double breadth = scanner.nextDouble();
        scanner.close();

        //setting dimension of rectangle using 'setDim' method
        rectangle.setDim(length, breadth);
        
        //Calculate and print the area of rectangle using 'getArea' method
        double area = rectangle.getArea();
        System.out.println("Area of rectangle:" + area);
    }

    //declare variable
    double length;
    double breadth;

    // constructor to to set the dimension of rectangle
    public void setDim(double length, double breadth) {

    this.length = length;
    this.breadth = breadth;

    }

    //second method to calculate and return the area of rectangle
    public double getArea() {
        return length * breadth;
    }

}


