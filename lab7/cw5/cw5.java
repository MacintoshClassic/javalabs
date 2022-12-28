
import java.util.LinkedList;
import java.util.Scanner;

public class cw5 {
    public static void main (String[] args) {
        LinkedList <String> songs = new LinkedList<>();
        
        Scanner title = new Scanner(System.in);
        Scanner singer = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        songs.add(title.nextLine());
        songs.add(singer.nextLine());
        songs.add(year.nextLine());

        System.out.println("The list has been created");
        System.out.println(songs);

    }
}
