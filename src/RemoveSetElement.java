import java.util.ArrayList;
import java.util.HashSet;

public class RemoveSetElement {
        public static void removeElement (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajGroup) {
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            kajGroup.remove(k);
        }


    }
}
