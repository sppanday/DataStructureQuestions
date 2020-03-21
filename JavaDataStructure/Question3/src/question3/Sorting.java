

package question3;

import java.util.Comparator;
public class Sorting {

 
   

        public static void main(String[] args) {
            TruckCollection trucks = trucksBuilder();
            print(trucks);
            System.exit(0);
        }

        private static TruckCollection trucksBuilder() {
            TruckCollection trucks = new TruckCollection();
            trucks.add(new Truck("Holden", "Colorado", 2, false, 0));
            trucks.add(new Truck("Chrysler", "Aspen", 3, false, 0));
            trucks.add(new Truck("Toyota", "Lite Ace", 4, false, 0));
            trucks.add(new Truck("Ford", "F350", 5, false, 0));
            trucks.add(new Truck("Dodge", "Sprinter", 6, false, 2));
            trucks.add(new Truck("Hino", "Ranger-Pro 9", 7, true, 0));
            trucks.add(new Truck("Ford", "LCF", 8, false, 0));
            trucks.add(new Truck("WesternStar", "4900FXT", 10, true, 0));
            trucks.add(new Truck("Mack", "Metro Liner", 11, true, 0));
            trucks.add(new Truck("DAF", "CF", 11, false, 0));
            trucks.add(new Truck("Kenworth", "T359", 12, false, 0));
            trucks.add(new Truck("Isuzu", "Giga CXY", 12, false, 0));
            return trucks;
        }

        private static void print(TruckCollection trucks) {
            for (Truck truck : trucks.getAllTrucksByMake()) {
                System.out.println(truck);
            }
        }
    }

    
class TruckSortByMake implements Comparator<Truck> {

        @Override
        public int compare(Truck alpha, Truck beta) {
            return alpha.getMake().compareTo(beta.getMake());

        }
    }
