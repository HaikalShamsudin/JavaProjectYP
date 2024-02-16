package Day3.Operators.Exec1;

public class Exercise1 {
    
    //question expression (page3)
    //declare variable given
    int k;
    int j = 10;
    double d1, d2, d3;
    int a = 5;
    int b = 7;
    boolean p;
    
    public static void main(String[] args) {
        //instantiate to calling the function
        Exercise1 exec1Var = new Exercise1(); //instantiate the class
        exec1Var.exec1Calculate();
    }

    //make function
    public void exec1Calculate() {
        this.k = this.a + this.b;
        this.p = (a>=b) ;
        System.out.println("go");
        double squareRoot = Math.sqrt(a);
        System.out.println("go");
    }
}
