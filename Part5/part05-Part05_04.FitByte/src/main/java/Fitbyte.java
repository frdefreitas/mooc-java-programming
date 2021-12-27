
/**
 *
 * @author Flavio
 */
public class Fitbyte {
    private int age;
    private double restHRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restHRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHRate = 206.3 - (0.711 * this.age);
        return (maxHRate - this.restHRate) * (percentageOfMaximum) + this.restHRate;
    }
    
    
    
    
}
