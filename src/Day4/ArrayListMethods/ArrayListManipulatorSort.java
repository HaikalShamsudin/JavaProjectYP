package Day4.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListManipulatorSort {
    
    //private field on can access in the class
    private ArrayList<Integer> arrayList;  //instantiate variable
    
    //constructor
    public ArrayListManipulatorSort () {
        arrayList = new ArrayList <> (); //instantiate
    }

    //Method to add an element to the ArrayList
    public void addElement (int element) {
        //controls
        arrayList.add(element);
    }

    //method to sort an element by object from the ArrayList
    public void sortElementByValue(int element) {
        //controls
        arrayList.sort(element);
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {                    //array manipulation
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
        arrayListManipulator.addElement(9);
        arrayListManipulator.addElement(1);
        arrayListManipulator.addElement(3);
        System.out.println(arrayListManipulator.getArrayList().toString());

    }
}
