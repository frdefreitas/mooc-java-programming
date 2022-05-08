
/**
 *
 * @author frdefreitas
 */

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        
        super.addToWarehouse(initialBalance);
        history.add(super.getBalance());
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double valTaken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return valTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " +
        this.history() + "\nLargest amount of product: " + history.maxValue() +
        "\nSmallest amount of product: " + history.minValue() + "\nAverage:" +
        history.average());
    }
}
