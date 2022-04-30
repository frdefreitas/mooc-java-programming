
/**
 *
 * @author frdefreitas
 */

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!storage.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit)) {
            storage.get(storageUnit).remove(item);
        }
        
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageWithItems = new ArrayList<>();
        
        for (String key: storage.keySet()) {
            if (!storage.get(key).isEmpty()) {
                storageWithItems.add(key);
            }
        }
        return storageWithItems;
    }
       
}
