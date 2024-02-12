package Lesson2.Operators.Exec1;

public class Exercise2 {

    // first, declare the variable
    
    int x1 = 2, x2 = 0;
    double xoff = Math.pow(x1 - x2, 2);
    int y1 = 1, y2 = 0;
    double yoff = Math.pow(y1 - y2, 2);
    int z1 = 3, z2 = 6;
    double zoff = Math.pow(z1 - z2, 2);


    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2(); // initiate object
        double d = exercise2.calculate();

        System.out.printf("Distance: %.2f", d);
    }

    // make the method
    public double calculate(){
        return Math.sqrt(xoff + yoff + zoff);
    }
}

        // Math.pow ni untuk the power of
        // Math.sqrt ni untuk square root