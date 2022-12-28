
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class cw7 {
    public static void main (String[] args) {

        Set<String> clothes = new HashSet<String>();
        
        Scanner item_1 = new Scanner(System.in);
        Scanner item_2 = new Scanner(System.in);
        Scanner item_3 = new Scanner(System.in);
        Scanner item_4 = new Scanner(System.in);
        Scanner item_5 = new Scanner(System.in);

        clothes.add(item_1.nextLine());
        clothes.add(item_2.nextLine());
        clothes.add(item_3.nextLine());
        clothes.add(item_4.nextLine());
        clothes.add(item_5.nextLine());

        // System.out.println(clothes);
        for (String sign: clothes){
            System.out.print(sign+", ");
        }

    }
}
