package Day8two.GenericClass.Q1;

import java.util.ArrayList;

public class GenericStack <T> implements Stack <T>{

    ArrayList <T> array; //this is an empty array
    int top = -1; // default top when stack is empty
    int size; // store size array

    //CONSTRUCTOR FOR THE SIZE
    public GenericStack (int size) {
        this.size = size; //store values in size
        this.array = new ArrayList<T>(size); // create array size
    }

    @Override 
    public void push(T item) {  //push element in stack
        
        if (top + 1 == size) {
            System.out.println("Stack overflow");
        } else {
            top = top + 1 ;
            if (array.size() > top) {
                array.set (top, item);
            } else {
                array.add(item);
            }
        }
    }

    @Override
    public void pop() {
        
        if (top == -1) {
            System.out.println("Stack underflow");

        } else {
            top --;
        }
    }

    @Override
    public void isEmpty() {
       
    }
    
}
