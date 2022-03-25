
/**
 *
 * @author frdefreitas
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public void addObservation() {
        this.observation++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean containName(String searched) {
        boolean status = false;
        if (this.name.equals(searched)) {
            status = true;
        }
        return status;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
    
    
}
