package Day4.ArrayListMethods;

public class SelectionSort {
    
    double [] array1 = {8.0, -2.5, -5.0, 1.0, 9.0};

    public static void main(String[] args) {
        
    }

    public static void selectionSort(double[] d, boolean inc){
        int idxToSwap, length = d.length;
        double temp;

        for (int i=0; i<= (length - 1); i++ ) {
            int k - i - 1;
            if (inc) {
                idxToSwap = findMaxIdx (d,k);
            }
            else {
                idxToSwap = findMaxIdx (d,k);
            }
        }
    }

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        for (int i = k+1; i<d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return maxIdx;
    }
    
}
