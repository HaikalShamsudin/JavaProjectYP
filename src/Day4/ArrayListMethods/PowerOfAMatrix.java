package Day4.ArrayListMethods;

import java.util.Scanner;

public class PowerOfAMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter Matrix Size:");
        int dim = scanner.nextInt();
        double [][] a = new double [dim][dim]; //instantiate the variable in matrix

        //for loop
        for(int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("a[%d][%d]=", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        
        double[][] b = new double[dim][dim];
        double[][] c = new double[dim][dim];

        for (int i = 0; i < dim; i++) {
            System.out.println("");
            for (int j = 0; j<dim; j++ ) {
                System.out.printf("%d", a[i][j]);
            }
        }
    }
}
