package Day8one.Interface.Q14;

public interface ShoppingCart {

    void addItem(Item item); // add on item to the cart
    void removeItem(Item item); // remove item from the cart   
    double calculateTotal(); //Calculate total cost in the cart 
}
