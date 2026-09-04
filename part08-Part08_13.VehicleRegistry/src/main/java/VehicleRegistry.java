import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> map;
    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (map.keySet().contains(licensePlate)) {
            return false;
        }

        map.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate) {
        return map.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) {
        if (!map.keySet().contains(licensePlate)) {
            return false;
        }

        map.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate license : map.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        Set<String> seen = new HashSet<>();
        for (String owner : map.values()) {
            if (!seen.contains(owner)) {
                System.out.println(owner);
                seen.add(owner);
            }
        }
    }
}
