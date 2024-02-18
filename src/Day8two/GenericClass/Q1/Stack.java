package Day8two.GenericClass.Q1;

public interface Stack <T> {

    public void push(T item); //Pushes an item onto the stack.
    public void pop(); //Pops and returns the top item from the stack.
    public void isEmpty(); //Returns true if the stack is empty, false otherwise.
    
}
