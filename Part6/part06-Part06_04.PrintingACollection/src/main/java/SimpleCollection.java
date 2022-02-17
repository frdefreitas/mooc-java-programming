
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    @Override
    public String toString() {
        int elemSize = elements.size();
        String printOutput = "";
        
        printOutput = "The collection " + this.name + " has " + elemSize +
                " elements:\n";
        
        if (elements.isEmpty()) {
           return "The collection " + this.name + " is empty.";
        }
        
        if (elemSize == 1) {
            return "The collection " + this.name + " has 1 element:\n" + 
                    elements.get(0);
            
        }
        String nameOnCollection = "";
        
        for (String element: elements) {
            nameOnCollection +=  element + "\n";
        }
        
        return printOutput + nameOnCollection;
    }
    
}
