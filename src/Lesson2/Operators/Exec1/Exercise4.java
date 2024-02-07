package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        
        // import scanner
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of n:");
        int n = scanner.nextInt();

        // declare variable 
        int nFact = 1;
        int i = 1;

        scanner.close(); 

        while (i<=n) {
            nFact = nFact*i;
            i = i + 1;
        } 
        System.out.println("n! =" + nFact);
    }

    

    

}