
import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int weight = 0;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.suitcases.add(suitcase);
        weight += suitcase.totalWeight();
        
        if (weight > this.maxWeight) {
            this.suitcases.remove(suitcase);
        }
    }
    
    @Override
    public String toString() {
        int numOfSuitcases = suitcases.size();
        return numOfSuitcases + " suitcases" + "(" + weight + " kg)";
    }
    
    public void printItems() {
        
        for (Suitcase suitcase: suitcases) {
           suitcase.printItems();
        }
    }
}
