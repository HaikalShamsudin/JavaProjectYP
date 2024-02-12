package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class FlowControlExec3Remake {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter value a:");       
    int a = scanner.nextInt();
    System.out.println("Enter value b:");
    int b = scanner.nextInt();
    System.out.println("Enter value c");
    int c = scanner.nextInt();
    scanner.close();
    
    System.out.println ("maximum:" + Ball(a, b, c));

    }
    
    public static int Ball(int a, int b, int c) {
        int m = 0;
        m = (a <= b) ? b : a;
        m = (m <= c) ? m : c;
        return m;

    }

}
