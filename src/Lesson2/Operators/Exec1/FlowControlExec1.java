package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class FlowControlExec1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y;");
        int y = sc.nextInt();

        if (x!=y) {
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
