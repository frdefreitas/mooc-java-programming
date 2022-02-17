
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;

    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        
        return this.stack;
    }
    
    public String take() {
        int lastIndex = this.stack.size() - 1;
        String last = this.stack.get(lastIndex);
        this.stack.remove(last);
        
        return last;
    }
}
