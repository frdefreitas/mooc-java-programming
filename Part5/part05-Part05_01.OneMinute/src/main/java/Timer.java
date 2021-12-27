
/**
 *
 * @author Flavio
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredsOfSecond;
    
    public Timer() {
        this.hundredsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredsOfSecond.advance();
        if (this.hundredsOfSecond.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hundredsOfSecond;
    }
}
