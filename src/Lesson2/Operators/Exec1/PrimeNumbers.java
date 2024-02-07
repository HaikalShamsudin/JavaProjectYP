package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class PrimeNumbers {
    
    // PRIME NUMBER - Numbers that when divide, have a remainder(balance) and when divide, cannot have an integer value

    // first method
    public static void main(String[] args) {
        
        // Import the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = scanner.nextInt();

        System.out.println("Enter ending number");
        int end = scanner.nextInt();

        getPrimeNumber(start,end);
        scanner.close();
    }

    // second method
    public static void getPrimeNumber(intFullStart, intFullEnd){

        // declare the variable
        int start = FullStart;
        int end = FullEnd;

        // go for loop
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%d,",i);
            }
        }
    }   
        
    
}
