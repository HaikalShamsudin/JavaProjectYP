package Day8one.Interface.Q14;

import java.util.ArrayList;
import java.util.List;

public class InStoreShoppingCart implements ShoppingCart {

    private List<Item> items;

    public InStoreShoppingCart () {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + "added to the in store cart");
    }

    @Override
    public void removeItem(Item item) {
      
    }

    @Override
    public double calculateTotal() {
       
    }

    
}
