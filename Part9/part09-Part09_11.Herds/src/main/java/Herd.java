
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herds.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m: herds) {
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable m: herds) {
            sb.append(m.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
