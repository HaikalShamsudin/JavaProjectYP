package Day4.ArrayListMethods;

import java.util.ArrayList;


public class ArrayListManipulator {
    
    //private field on can access in the class
    private ArrayList<Integer> arrayList;  //instantiate variable
    
    //constructor
    public ArrayListManipulator () {
        arrayList = new ArrayList <> (); //instantiate
    }

    //Method to add an element to the ArrayList
    public void addElement (int element) {
        //controls
        arrayList.add(element);
    }

    //method to remove an element by object from the ArrayList
    public void removeElementByValue(int element) {
        //controls
        arrayList.remove(Integer.valueOf(element));
    }
    //method to remove an element by index from the ArrayList
    public void removeElementBtIndex(int element) {
        arrayList.remove(Integer.valueOf(element));
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {                    //array manipulation
        ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
        arrayListManipulator.addElement(90);
        arrayListManipulator.addElement(100);
        arrayListManipulator.addElement(150);
        System.out.println(arrayListManipulator.getArrayList().toString());

        arrayListManipulator.removeElementByValue(90);
        //[100,150]
        arrayListManipulator.removeElementBtIndex(1);
        // [100]
        System.out.println(arrayListManipulator.getArrayList().toString());
    }

    

    

}
