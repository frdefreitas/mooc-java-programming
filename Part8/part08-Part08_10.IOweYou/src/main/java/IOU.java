
import java.util.HashMap;


/**
 *
 * @author frdefreitas
 */
public class IOU {
    private HashMap<String, Double> iOwe;
    
    public IOU() {
        this.iOwe = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.iOwe.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.iOwe.getOrDefault(toWhom, 0.0);
        
    }
}
