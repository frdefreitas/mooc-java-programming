/**
 *
 * @author Pichau
 */
import java.util.ArrayList;

public class RickRolling {
    private ArrayList text;
    
    public RickRolling (ArrayList text) {
        this.text = text;
    }
    
    public void addLine(String line) {
        this.text.add(line);
    }
    
    public void printLine(int index) {
        System.out.println(this.text.get(index));
    }
    
    
    
}
