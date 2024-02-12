package Day5.Kalkulator;

public class Calculator1 {
    
    //declare variable
    int a,b;

    //constructor
    public Calculator1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //METHOD
    public double getAdded () {
        return a+b;
    }

    public static void main(String[] args) {

        //CREATE OBJECT
        Calculator1 calculator = new Calculator1(2, 3);
        System.out.println("The added value:" + calculator.getAdded());
    }

}
