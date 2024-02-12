package Day4.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListStringManipulator {
    
    //private field on can access in the class
    private ArrayList<String> arrayList;  //instantiate variable
    
    //constructor
    public ArrayListStringManipulator () {
        arrayList = new ArrayList <> (); //instantiate
    }

    //Method to add an element to the ArrayList
    public void addElement(String element) {
        //controls
        arrayList.add(element);
    }

    //method to remove an element by object from the ArrayList
    public void removeElementByValue(String element) {
        //controls
        arrayList.remove((element));  //primitative element, so just masukkan (element)
    }
    //method to remove an element by index from the ArrayList
    public void removeElementBtIndex(int element) {   //always use int because of index
        arrayList.remove((element)); //primitative element
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public static void main(String[] args) {                    //array manipulation
        ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();
        arrayListStringManipulator.addElement("ball");
        arrayListStringManipulator.addElement("book");
        arrayListStringManipulator.addElement("monitor");

        System.out.println(arrayListStringManipulator.getArrayList().toString());

        arrayListStringManipulator.removeElementByValue("book");
        //[ball,monitor]
        arrayListStringManipulator.removeElementBtIndex(1);
        // [ball]
        System.out.println(arrayListStringManipulator.getArrayList().toString());
    }
}
