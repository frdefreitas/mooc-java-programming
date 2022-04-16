
/**
 *
 * @author frdefreitas
 */
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> cars;
    
    public VehicleRegistry() {
        this.cars = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!cars.containsKey(licensePlate)) {
            cars.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.cars.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (cars.containsKey(licensePlate)) {
            cars.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate liPlate: cars.keySet()) {
            System.out.println(liPlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: cars.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
