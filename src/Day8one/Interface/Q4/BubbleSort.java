package Day8one.Interface.Q4;

import java.util.Arrays;

public class BubbleSort implements SortableInterface {

    
    
    @Override
    public void sort(int[] array) {

        //declare 
        int n = array.length;

        //loop
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array [j] = array[j+1];
                    array [j+1] = temp;
                }
            }
            
        } System.out.println("Bubble Sort:" + Arrays.toString(array));

    }
    
}
