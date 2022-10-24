import java.util.ArrayList;
import java.util.HashSet;

public class InputArrayInfo {

    protected static void inputEle(HashSet<? extends Kaj> kajGroup, ArrayList<Vehicle> arrayList, String text, int weight){

        Vehicle v = new Vehicle();

        v.setName(text);
        v.setSelfweight(weight);
        kajGroup.stream().findFirst().ifPresent(s -> v.setParkering(s.getName()));

        arrayList.add(v);

    }
}
