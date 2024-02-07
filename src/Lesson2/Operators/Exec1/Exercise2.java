package Lesson2.Operators.Exec1;

public class Exercise2 {

    // first, declare the variable
    double xoff, yoff, zoff;
    int x1 = 2, x2 = 0;
    int y1 = 1, y2 = 0;
    int z1 = 3, z2 = 6;

    // then, initiate
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        double d = exercise2.calculate();

        System.out.printf("Distance: %.2f", d);
    }

    // make the method
    public double calculate(){
        this.xoff = Math.pow(this.x1 - this.x2, 2);
        this.yoff = Math.pow(this.y1 - this.y2, 2);
        this.zoff = Math.pow(this.z1 - this.z2, 2);

        // return the value to execute
        return Math.sqrt(this.xoff + this.yoff + this.zoff);
    }
}

        // Math.pow ni untuk the power of
        // Math.sqrt ni untuk square root