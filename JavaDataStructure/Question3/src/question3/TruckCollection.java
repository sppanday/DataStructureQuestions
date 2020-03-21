package question3;
import java.util.*;

class TruckCollection {

    private List<Truck> trucks = new ArrayList<Truck>();

    public void add(Truck truck) {
        trucks.add(truck);
    }

    public Collection<Truck> getAllTrucksByMake() {
        Collections.sort(trucks, new TruckSortByMake());
        return trucks;
    }

}