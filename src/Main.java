import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> arrayList = new ArrayList<>();

        Kaj a = new Kaj("A");
        Kaj b = new Kaj("B");
        Kaj c = new Kaj("C");
        Kaj d = new Kaj("D");
        Kaj e = new Kaj("E");

        HashSet<Kaj> kajVan = new HashSet<>();
        HashSet<Kaj> kajSmallTruck1 = new HashSet<>();
        HashSet<Kaj> kajSmallTruck2 = new HashSet<>();
        HashSet<Kaj> kajHeavyTruck1 = new HashSet<>();
        HashSet<Kaj> kajHeavyTruck2 = new HashSet<>();
        kajVan.add(a);
        kajVan.add(b);
        kajSmallTruck1.add(a);
        kajSmallTruck1.add(c);
        kajSmallTruck1.add(d);
        kajSmallTruck2.add(d);
        kajSmallTruck2.add(c);
        kajHeavyTruck1.add(e);
        kajHeavyTruck1.add(d);
        kajHeavyTruck2.add(e);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("– Avlastningsstationen dumpa mera – ");
            System.out.println("1. Se parkerade lastbilar ");
            System.out.println("2. Registrera ny avlastande lastbil");
            System.out.println("3. Avsluta");
            System.out.println("Välj från listan:");
            String choice = sc.next();

            switch (choice){
                case("1") -> printOutList(arrayList);
                case("2") -> Type(arrayList,kajVan,kajSmallTruck1,kajSmallTruck2,kajHeavyTruck1,kajHeavyTruck2);
                case("3") -> System.exit(0);

            }
        }
    }


    protected static void printOutList(ArrayList<Vehicle> arrayList){
        if(arrayList.isEmpty()){
            System.out.println("This list is empty");

        }
        arrayList.forEach( vehicle ->
                System.out.println(vehicle.getParkering()+" - " + vehicle.getName() +
                        " [" + vehicle.getSelfweight() + "kg]")

        );

        System.out.println("-----------------------------");

    }

    private static void removeElement (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajGroup) {
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            kajGroup.remove(k);
        }


    }

/*
    private static HashSet<Kaj> removeKajVanEl(ArrayList<Vehicle> arrayList, HashSet<Kaj> kajVan){
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            if (kajVan.contains(k)) {
                kajVan.remove(k);
            }
        }
        return (HashSet<Kaj>) kajVan;
    }

    private static HashSet<Kaj> removeKajSmallTruck1El (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajSmallTruck1){

        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            if (kajSmallTruck1.contains(k)) {
                kajSmallTruck1.remove(k);
            }
        }
        return kajSmallTruck1;
    }

    private static HashSet<Kaj> removeKajSmallTruck2El (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajSmallTruck2){
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            if (kajSmallTruck2.contains(k)) {
                kajSmallTruck2.remove(k);
            }
        }
        return kajSmallTruck2;
    }

    private static HashSet<Kaj> removeKajHeavyTruck1El (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajHeavyTruck1){
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            if (kajHeavyTruck1.contains(k)) {
                kajHeavyTruck1.remove(k);
            }
        }
        return kajHeavyTruck1;
    }

    private static HashSet<Kaj> removeKajHeavyTruck2El (ArrayList<Vehicle> arrayList, HashSet<Kaj> kajHeavyTruck2){
        for (Vehicle vehicle : arrayList) {
            Kaj k = new Kaj(vehicle.getParkering());
            if (kajHeavyTruck2.contains(k)) {
                kajHeavyTruck2.remove(k);
            }
        }
        return kajHeavyTruck2;
    }
*/

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
        switch (choice2){
            case "1" -> {if(kajVan.isEmpty()){
                System.out.println("Tyvärr är det fullt, hänvisa förare till stationen dumpa mest!");
                break;
                }

                inputVan(kajVan,arrayList);
                removeElement(arrayList,kajVan);
                removeElement(arrayList,kajSmallTruck1);
                removeElement(arrayList,kajSmallTruck2);
                removeElement(arrayList,kajHeavyTruck1);
                removeElement(arrayList,kajHeavyTruck2);
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

                inputSmallTruck(arrayList,kajSmallTruck1,kajSmallTruck2);
                removeElement(arrayList,kajVan);
                removeElement(arrayList,kajSmallTruck1);
                removeElement(arrayList,kajSmallTruck2);
                removeElement(arrayList,kajHeavyTruck1);
                removeElement(arrayList,kajHeavyTruck2);
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
                inputHeavyTruck(arrayList,kajHeavyTruck1,kajHeavyTruck2);
                removeElement(arrayList,kajVan);
                removeElement(arrayList,kajSmallTruck1);
                removeElement(arrayList,kajSmallTruck2);
                removeElement(arrayList,kajHeavyTruck1);
                removeElement(arrayList,kajHeavyTruck2);
/*                removeKajVanEl(arrayList,kajVan);
                removeKajSmallTruck1El(arrayList,kajSmallTruck1);
                removeKajSmallTruck2El(arrayList,kajSmallTruck2);
                removeKajHeavyTruck1El(arrayList,kajHeavyTruck1);
                removeKajHeavyTruck2El(arrayList,kajHeavyTruck2);*/

            }
        }
    }

    private static void printArray(ArrayList<Vehicle> arrayList){
        int index = arrayList.size() - 1;
        System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");

    }



    private static void inputVan(HashSet<Kaj> kajVan, ArrayList<Vehicle> arrayList){

        Vehicle v = new Vehicle();
        int w = weight();
        v.setName("Skåpbil");
        v.setSelfweight(w);
        kajVan.stream().findFirst().ifPresent(s -> v.setParkering(s.getName()));

        arrayList.add(v);
/*
        int index = arrayList.size() - 1;
        System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + arrayList.get(index).getSelfweight() + " kg");
*/
        printArray(arrayList);
    }

    private static void inputSmallTruck(ArrayList<Vehicle> arrayList, HashSet<Kaj> kajSmallTruck1, HashSet<Kaj> kajSmallTruck2 ){
        Vehicle v = new Vehicle();
        int w = weight();
        v.setName("Lätt lastbil");
        v.setSelfweight(w);
        if(w > 5000){
            if(kajSmallTruck2.isEmpty()){
                System.out.println("weight should be less than 5000 kg");

            }else {
                v.setParkering(kajSmallTruck2.stream().findFirst().get().getName());
                arrayList.add(v);
/*
                int index = arrayList.size() - 1;
                System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + arrayList.get(index).getSelfweight() + " kg");
*/
                printArray(arrayList);

            }

        }else {
            kajSmallTruck1.stream().findFirst().ifPresent(s -> v.setParkering(s.getName()));
            arrayList.add(v);
/*
            int index = arrayList.size() - 1;
            System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");
*/
            printArray(arrayList);

        }


    }
    private static void inputHeavyTruck(ArrayList<Vehicle> arrayList, HashSet<Kaj> kajHeavyTruck1, HashSet<Kaj> kajHeavyTruck2 ){
        Vehicle v = new Vehicle();
        int w = weight();
        v.setName("Tung lastbil");
        v.setSelfweight(w);
        if(w > 9000){
            if(kajHeavyTruck2.isEmpty()){
                System.out.println("weight should be less than 9000 kg");

            }else{
                v.setParkering(kajHeavyTruck2.stream().findFirst().get().getName());
                arrayList.add(v);
/*
                int index = arrayList.size() - 1;
                System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");
*/
                printArray(arrayList);
            }
        }else {
            kajHeavyTruck1.stream().findFirst().ifPresent(s -> v.setParkering(s.getName()));

            arrayList.add(v);
/*
            int index = arrayList.size() - 1;
            System.out.println(arrayList.get(index).getParkering() + " - " + arrayList.get(index).getName() + " " + arrayList.get(index).getSelfweight() + " kg");
*/
            printArray(arrayList);
        }


    }

    private static int weight(){
        System.out.println("Vikt på");
        Scanner sc = new Scanner(System.in);
        String choice3 = sc.next();
        return Integer.parseInt(choice3);
    }
}