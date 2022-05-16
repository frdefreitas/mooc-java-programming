

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;
    
    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productsPrice.put(product, price);
        productsStock.put(product, stock);
    }
    
    public int price(String product) {
        return productsPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productsStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stock(product) -1 < 0) {
            return false;
        }
        productsStock.put(product, stock(product) -1);
        return true;
    }
    
    public Set<String> products() {
        return productsStock.keySet();
    }
    
}
