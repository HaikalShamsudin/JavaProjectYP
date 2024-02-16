package Day3.Operators.Exec1;

public class Exercise2remake {
    
    //DECLARE THE VARIABLE

    public static void main(String[] args) {

    int x1 = 2;
    int x2 = 0;
    double xoff = Math.pow(x1-x2,2); 
    int y1 = 1;
    int y2 = 0;
    double yoff = Math.pow(y1-y2,2); 
    int z1 = 3;
    int z2 = 6;
    double zoff = Math.pow(z1-z2,2); 
    //declare d
    double d = Math.sqrt(xoff + yoff + zoff);

    System.out.printf("distance: %.2f", d);

    }

    

}
