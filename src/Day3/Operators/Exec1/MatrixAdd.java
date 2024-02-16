package Day3.Operators.Exec1;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to sum");
        int n = scanner.nextInt();
        System.out.println("matrix:" + matrix(n));
        System.out.println("verify:" + verify (n));
        scanner.close();
        
    }

    static int matrix (int n) {
        return (n/2)*(n+1);
    }

    static int verify (int n) {
        int f = 0;
        for (int i = 0; i<=n; i++) f+=i;
        return f;
    }
}
