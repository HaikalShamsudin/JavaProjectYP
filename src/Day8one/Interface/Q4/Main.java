package Day8one.Interface.Q4;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        //declare the variable of an array
        int[] array = {4,2,3,1,5,7,10};
        
        System.out.println((Arrays.toString(array)));

        //instantiate/creating an objet
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

    
    }
    
}
