package Day5.Kalkulator;

public class Calculator2 {
    //declare variable
    int a,b,c;

    //constructor
    public Calculator2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //METHOD
    public double getAverage () {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {

        //CREATE OBJECT
        Calculator2 calculator = new Calculator2(2, 3, 4);
        System.out.println("The average value:" + calculator.getAverage());
    }
}
