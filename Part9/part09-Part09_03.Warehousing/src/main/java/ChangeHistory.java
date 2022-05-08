
/**
 *
 * @author frdefreitas
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        
        double highestVal = Double.MIN_VALUE;
        for (double val: history) {
            if (val > highestVal) {
                highestVal = val;
            }
        }
        return highestVal;
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        
        double lowestVal = Double.MAX_VALUE;
        for (double val: history) {
            if (val < lowestVal) {
                lowestVal = val;
            }
        }
        return lowestVal;
    }
    
    public double average() {
        double sum = 0.0;
        for (double val: history) {
            sum += val;
        }
        return sum / history.size();
    }
}
