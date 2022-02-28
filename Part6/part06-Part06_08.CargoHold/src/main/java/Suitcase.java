
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        this.items.add(item);
        
        if (this.totalWeight() > maxWeight) {
            this.items.remove(item);
        }
            
    }
    
    @Override
    public String toString() {
        int numOfItems = items.size();
        
        if (numOfItems == 0) {
            return "no items (0 kg)";
        }
        
        if (numOfItems == 1) {
            return "1 item" + "(" + this.totalWeight() + " kg)";
        }
        
        return numOfItems + " items" + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item: items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        Item heaviestItem = new Item("",0);
        
        if (this.items.isEmpty()) {
            return null;
        }
        
        for (Item item: items) {
            
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
}
