import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (map.keySet().contains(unit)) {
            map.get(unit).add(item);
        } else {
            ArrayList<String> newItems = new ArrayList<>();
            newItems.add(item);
            map.put(unit, newItems);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!map.keySet().contains(storageUnit)) {
            return new ArrayList<>();
        }

        return map.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (!map.keySet().contains(storageUnit)) {
            return;
        }
        
        map.get(storageUnit).remove(item);
        if (map.get(storageUnit).isEmpty()) {
            map.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(map.keySet());
    }
}
