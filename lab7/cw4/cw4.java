
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cw4 {
    public static void main (String[] args) {
        List <String> movies = new ArrayList<String>();
        
        Scanner title = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        movies.add(title.nextLine());
        movies.add(year.nextLine());

        System.out.println("The list has been created");
        System.out.println(movies);
    }
}
