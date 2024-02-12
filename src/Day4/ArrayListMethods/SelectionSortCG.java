package Day4.ArrayListMethods;

public class SelectionSortCG {
    
    public static void selectionSort(double[] arr, boolean increasingOrder) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indexToSwap;
            if (increasingOrder) {
                indexToSwap = findMinIdx(d, i;
            } else {
                indexToSwap = findMaxIdx(d, i);
            }

            // Swap the found minimum or maximum element with the element at index i
            double temp = arr[indexToSwap];
            arr[indexToSwap] = arr[i];
            arr[i] = temp;
        }
    }

    public static int findMinIdx(double[] arr, int k) {
        int minIdx = k;

        for (int i = k + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }

        return minIdx;
    }

    public static int findMaxIdx(double[] arr, int k) {
        int maxIdx = k;

        for (int i = k + 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }

        return maxIdx;
    }

    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // INSTANTIATE THE ARRAYS IN INDEX
        double[] data = {3.5, 1.2, 5.8, 2.4, 4.7};

        System.out.println("Original array:");
        printArray(data);

        // Sorting in increasing order
        selectionSort(data, true);
        System.out.println("Array after increasing order sort:");
        printArray(data);

    }
}
