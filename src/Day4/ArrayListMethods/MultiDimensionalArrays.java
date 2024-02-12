package Day4.ArrayListMethods;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][][] a = {{{1, 2, 3}, {4, 5}, {6}}, {{7, 8}, {9}}}; //instantiate the variable in index

        System.out.println("a.length = " + a.length);

        //using for loop
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\n[%d.length = %d]",a[i].length);

            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\n[%d][%d].length = %d]", a[i][j].length);

                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.printf("\n[%d][%d][%d] = %d]", a[i][j][k]);
                }
            }
        }
    }
}

