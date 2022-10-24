import java.util.ArrayList;
import java.util.HashSet;

public class SmallTruck extends Vehicle{



    protected static void input(ArrayList<Vehicle> arrayList, HashSet<Kaj> kajSmallTruck1, HashSet<Kaj> kajSmallTruck2, String text ){
        int w = InputWeight.weight();
        if(w > 5000){
            if(kajSmallTruck2.isEmpty()){
                System.out.println("weight should be less than 5000 kg");

            }else {
                InputArrayInfo.inputEle(kajSmallTruck2,arrayList,text,w);
/*                Vehicle v = new Vehicle();

                v.setName("Lätt lastbil");
                v.setSelfweight(w);
                v.setParkering(kajSmallTruck2.stream().findFirst().get().getName());
                arrayList.add(v);

                int index = arrayList.size() - 1;
                System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + arrayList.get(index).getSelfweight() + " kg");
*/
                PrintNotice.printArray(arrayList);

            }

        }else {
            InputArrayInfo.inputEle(kajSmallTruck1,arrayList,text,w);
/*            Vehicle v = new Vehicle();
            int w = weight();
            v.setName("Lätt lastbil");
            v.setSelfweight(w);
            kajSmallTruck1.stream().findFirst().ifPresent(s -> v.setParkering(s.getName()));
            arrayList.add(v);

            int index = arrayList.size() - 1;
            System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");
*/
            PrintNotice.printArray(arrayList);

        }


    }


}
