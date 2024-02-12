package Lesson2.Operators.Exec1;

import java.util.Scanner;

public class FlowControlExec2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean p = true;
        boolean q = false;
        scanner.close();

        if (p && q) {
            q = false;
        } else {
            if(!q)
            System.out.println(p);
            if (p==q)
            System.out.println(p||q);
        }
        System.out.println((q));
        
    }
}
