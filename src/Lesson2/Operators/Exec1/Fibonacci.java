package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class Fibonacci {
    
    // FIBONACCI SERIES NUMBER - 0 1 1 2 3 5 8 13


    // import the scanner object
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of n");
        int f = scanner.nextInt();
        scanner.close();
        
        System.out.println(fibonacci(f));
    }

    public static int fibonacci(int n) {
        int F0 = 0;
        int F1 = 1;
        int F = F1 + F0;

        for (int i = 0; i<n ; i++) {
            System.out.println(F0 + " ");
            F = F1 + F0;
            F0 = F1;
            F1 = F;
        }

        return F0;
    }
    
}
