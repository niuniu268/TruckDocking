import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SecondScreen {
    protected static void Type(ArrayList<Vehicle> arrayList,
                               HashSet<Kaj> kajVan, HashSet<Kaj> kajSmallTruck1,
                               HashSet<Kaj> kajSmallTruck2, HashSet<Kaj> kajHeavyTruck1,
                               HashSet<Kaj> kajHeavyTruck2){
        System.out.println("Typ av lastbil:");
        System.out.println("1. Skåpbil");
        System.out.println("2. Lätt lastbil");
        System.out.println("3. Tung lastbil");
        System.out.println("Välj från listan: ");
        Scanner sc = new Scanner(System.in);
        String choice2 = sc.next();
        String text ;
        switch (choice2){
            case "1" -> {if(kajVan.isEmpty()){
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
                break;
            }
                text = "Skåpbil";

                Van.input(kajVan,arrayList,text);
                RemoveSetElement.removeElement(arrayList,kajVan);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck1);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck2);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck1);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck2);
/*                removeKajVanEl(arrayList,kajVan);
                removeKajSmallTruck1El(arrayList,kajSmallTruck1);
                removeKajSmallTruck2El(arrayList,kajSmallTruck2);
                removeKajHeavyTruck1El(arrayList,kajHeavyTruck1);
                removeKajHeavyTruck2El(arrayList,kajHeavyTruck2);*/

            }
            case "2" -> {if(kajSmallTruck2.isEmpty()&&kajSmallTruck1.isEmpty()){
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
                break;
            }
                text = "Lätt lastbil";


                SmallTruck.input(arrayList,kajSmallTruck1,kajSmallTruck2,text);
                RemoveSetElement.removeElement(arrayList,kajVan);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck1);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck2);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck1);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck2);
/*                removeKajVanEl(arrayList,kajVan);
                removeKajSmallTruck1El(arrayList,kajSmallTruck1);
                removeKajSmallTruck2El(arrayList,kajSmallTruck2);
                removeKajHeavyTruck1El(arrayList,kajHeavyTruck1);
                removeKajHeavyTruck2El(arrayList,kajHeavyTruck2);*/


            }
            case "3" -> {if(kajHeavyTruck2.isEmpty()&&kajHeavyTruck1.isEmpty()){
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
                break;
            }
                text = "Tung lastbil";

                HeavyTruck.input(arrayList,kajHeavyTruck1,kajHeavyTruck2,text);
                RemoveSetElement.removeElement(arrayList,kajVan);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck1);
                RemoveSetElement.removeElement(arrayList,kajSmallTruck2);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck1);
                RemoveSetElement.removeElement(arrayList,kajHeavyTruck2);
/*                removeKajVanEl(arrayList,kajVan);
                removeKajSmallTruck1El(arrayList,kajSmallTruck1);
                removeKajSmallTruck2El(arrayList,kajSmallTruck2);
                removeKajHeavyTruck1El(arrayList,kajHeavyTruck1);
                removeKajHeavyTruck2El(arrayList,kajHeavyTruck2);*/

            }
        }
    }
}
