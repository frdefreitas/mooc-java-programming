
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, 
                                   this.cents + addition.cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuro = this.euros;
        int newCents = this.cents;
        
        if (this.cents - decreaser.cents < 0) {
           newCents = this.cents +100;
           newEuro = this.euros - 1;
        }
           
        Money newMoney = new Money(newEuro - decreaser.euros,
                                   newCents - decreaser.cents);
        
        if (newMoney.euros < 0) {
            newMoney = new Money(0,0);
        }
        
        return newMoney;
    }

}
