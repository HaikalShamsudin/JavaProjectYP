package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class FlowControlExec4Remake {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter value of n:");
    int n = scanner.nextInt();

    int nFact = 1;
    int i = 1;
    scanner.close();

    while(i<=n) {
        nFact = nFact*i;
        i = i + 1;

    }
    System.out.println("n! =" + nFact);
    }
}
