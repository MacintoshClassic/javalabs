
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class cw6 {
    public static void main (String[] args) {
        Set<String> flowers = new HashSet<String>();
        
        flowers.add("Rose");
        flowers.add("Azalea");
        flowers.add("Aster");
        flowers.add("Crocus");
        flowers.add("Buttercup");

        Scanner check = new Scanner(System.in);

        System.out.println("Does the list contain your writte flower?: " + flowers.contains(check.nextLine()));

    }
}
