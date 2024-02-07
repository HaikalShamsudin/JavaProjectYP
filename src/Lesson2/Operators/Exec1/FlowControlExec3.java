package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class FlowControlExec3 {
    

    public static void main(String[] args) {
        
        // import the object (scanner)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the amount of b");
        int b = scanner.nextInt();

        System.out.println("Enter the amount of c");
        int c = scanner.nextInt();

        System.out.println(BloC( a, b, c));

        scanner.close();

    }

    public static int BloC(int a, int b, int c){
        int m = 0;
        m = (a <= b) ? b : a;
        m = (m >= c) ? m : c;
        return m;
    }
}
