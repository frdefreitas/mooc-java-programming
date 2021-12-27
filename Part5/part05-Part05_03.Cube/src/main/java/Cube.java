
/**
 *
 * @author Flavio
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        return (this.edgeLength * this.edgeLength * this.edgeLength);
    }
    
    @Override
    public String toString() {
        return "the length of the edge is " + edgeLength + " and the volume " + volume(); 
    }
    
}
