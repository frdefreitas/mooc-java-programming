
/**
 *
 * @author frdefreitas
 */
import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxWeight;
    
    public Box(double weight) {
        this.maxWeight = weight;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + weight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item: items) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
