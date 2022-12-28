
import java.util.LinkedList;
import java.util.Scanner;

public class cw3 {
    public static void main (String[] args) {
        LinkedList <String> shopping_list = new LinkedList<>();
        
        Scanner product = new Scanner(System.in);
        Scanner quantity = new Scanner(System.in);
        Scanner price = new Scanner(System.in);

        shopping_list.add(product.nextLine());
        shopping_list.add(quantity.nextLine());
        shopping_list.add(price.nextLine());

        System.out.println("The list has been created");
        System.out.println(shopping_list);

    }
}
