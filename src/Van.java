import java.util.ArrayList;
import java.util.HashSet;

public class Van extends Vehicle{
    public static void input(HashSet<Kaj> kajVan, ArrayList<Vehicle> arrayList, String text){
        int w = InputWeight.weight();
        InputArrayInfo.inputEle(kajVan,arrayList,text, w);
/*
        int index = arrayList.size() - 1;
        System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + arrayList.get(index).getSelfweight() + " kg");
*/
        PrintNotice.printArray(arrayList);
    }


}
