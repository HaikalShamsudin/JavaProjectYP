package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
        
        // create the scanner object

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        // create the variable x
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        // create the variable y
        int y = sc.nextInt();

        if (x!=y){
            System.out.println("1");
        }
        if (x>y) {
            System.out.println("2");
        }
        if (x%y == 0) {
            System.out.println("3");
        }
        sc.close();
    }

}
