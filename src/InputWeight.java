import java.util.Scanner;

public class InputWeight {

    protected static int weight() {
        System.out.println("Vikt på");
        Scanner sc = new Scanner(System.in);
        String choice3 = sc.next();
        return Integer.parseInt(choice3);
    }
}
