
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cw2 {
    public static void main (String[] args) {
        
        List <String> workers = new ArrayList<String>();
        
        Scanner name = new Scanner(System.in);
        Scanner surname = new Scanner(System.in);
        Scanner experience = new Scanner(System.in);

        workers.add(name.nextLine());
        workers.add(surname.nextLine());
        workers.add(experience.nextLine());

        System.out.println("The list have been created");
        System.out.println(workers);

    }
}
