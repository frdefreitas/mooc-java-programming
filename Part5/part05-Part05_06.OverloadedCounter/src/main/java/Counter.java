/**
 *
 * @author Flavio
 */

public class Counter {
    private int value;
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this.value = 0;
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value++;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.value = this.value + increaseBy;
    }
    
    public void decrease() {
        this.value--;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.value = this.value - decreaseBy;
    }
    
    @Override
    public String toString() {
        return "Value of counter is: " + this.value;
    }
    
}
