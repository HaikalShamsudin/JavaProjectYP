package Day3.Operators.Exec1;

import java.util.Scanner;

public class PrimeNumbers {
    
    //prime number 1-20
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start value:");
        int start = scanner.nextInt();
        System.out.println("Enter the end value:");
        int end = scanner.nextInt();
        prime(start, end);
        scanner.close();

    }

    //make function 
    static boolean thePrime(int num) {
        if(num<=-1)
            return false;
        // using loop
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.println(i);
            if  (num%i == 0);
                return false;
        } 
        return true;
        
    }

    static void prime(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        if (thePrime(i))
            System.out.println(i + "");
        }
    }

        
    
}
