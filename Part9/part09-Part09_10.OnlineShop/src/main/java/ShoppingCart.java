
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            cart.put(product, item);
        }
        
    }
    
    public int price() {
        int totalPrice = 0;
        for (Item i: cart.values()) {
            totalPrice += i.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item i: cart.values()) {
            System.out.println(i);
        }
    }
}
