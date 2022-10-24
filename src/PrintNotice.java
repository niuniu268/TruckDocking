import java.util.ArrayList;

public class PrintNotice {


    public static void printOutList(ArrayList<Vehicle> arrayList){
        if(arrayList.isEmpty()){
            System.out.println("This list is empty");

        }
        arrayList.forEach( vehicle ->
                System.out.println(vehicle.getParkering()+" - " + vehicle.getName() +
                        " [" + vehicle.getSelfweight() + "kg]")

        );

        System.out.println("-----------------------------");

    }

    protected static void printArray(ArrayList<Vehicle> arrayList){
        int index = arrayList.size() - 1;
        System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");

    }

}
