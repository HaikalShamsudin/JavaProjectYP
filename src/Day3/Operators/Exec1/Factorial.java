package Day3.Operators.Exec1;

import java.util.Scanner;

public class Factorial {
    
    // A factorial is a function in mathematics with the symbol (!) that multiplies 
    // a number (n) by every number that precedes it. In simpler words, the factorial 
    // function says to multiply all the whole numbers from the chosen number down to one
    // EXAMPLE: 6! = 6x5x4x3x2x1 = 720

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the factorial number:");
        int intA = scanner.nextInt();
        ;

    }

    //make new function
    public static long factorial(long n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*factoriall(n-1);
        }
    }
}
