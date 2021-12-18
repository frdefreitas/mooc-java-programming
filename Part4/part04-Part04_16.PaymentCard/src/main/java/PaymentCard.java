
/**
 *
 * @author Flavio
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        this.balance -= 2.60;
        
        if (this.balance < 0) {
            this.balance += 2.60;
        }
    }
    
    public void eatHeartily() {
        this.balance -= 4.60;
        
        if (this.balance < 0) {
            this.balance += 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        
        this.balance += amount;
        
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
}
