package Day8two.GenericClass.Q3;

public interface Queue<T> {

    public void enqueue(T item);
    public T dequeue();
    public boolean isEmpty();
} 
    
