package Day7.Example2;

import java.util.Scanner;

public class ConsoleReaderExample {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("You entered:" + num);
        sc.close();
    }
}
